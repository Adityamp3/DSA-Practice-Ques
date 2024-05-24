import java.util.*;
class cutLowerRanks {
    public static void main(String[] args) {
        System.out.print("Number of Students : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        int count=0;
        
        for(int i=0; i<n; i++){
            ll.add(sc.nextInt());
        }
        for(int j=0; j<n-1; j++){
            if(ll.get(j)>ll.get(j+1)){
                count++;
            }else{
                count++;
                j+=2;
            }
        }
        System.out.println("\nAnswer : "+count);
    }
}
