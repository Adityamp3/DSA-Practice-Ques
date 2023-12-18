// Asked in Flipkart Interview

// THE CHOCOCLATE DISTRIBUTION PROBLEM
// Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
// 1. Each student gets exactly one packet.
// 2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.
    
import java.util.*;
class ChocolateDistribution
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
  	    System.out.println(ob.findMinDiff(arr,n,m));
        }
    }
}

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        long diff=0;
        long temp=0;
        Collections.sort(a);
        for(int i=0; i+m-1<n; i++){
            temp=a.get(m-1+i)-a.get(i);
            if(temp<diff || i==0){
                diff=temp;
            }
        }
        return diff;
    }
}
