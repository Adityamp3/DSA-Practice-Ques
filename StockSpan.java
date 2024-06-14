// GFG Link - https://www.geeksforgeeks.org/the-stock-span-problem/

// Input: N = 7, price[] = [100 80 60 70 60 75 85]
// Output: 1 1 1 2 1 4 6

// Input: N = 6, price[] = [10 4 5 90 120 80]
// Output:1 1 2 4 5 1

import java.util.*;
class GFG {
    static int calculateSpan(Stack<Integer> s, int i){
        int count=0;
        for(int j=i; j>-1; j--){
            if(s.get(j)>s.get(i))
                break;
            count++;
        }
        return count;
    }

    // Driver code
    public static void main(String[] args){
        int a=0,b=0;
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s.push(10);
        s.push(4);
        s.push(5);
        s.push(90);
        s.push(120);
        s.push(80);
        
        for(int i=1; i<s.size(); i++){
            a = s.get(i-1);
            b = s.get(i);
            if(a>b)
                s1.push(1);
            else
                s1.push(calculateSpan(s, i));
        }
        for(int i=0; i<s1.size(); i++){
            System.out.print(s1.get(i)+" ");
        }
    }
}
