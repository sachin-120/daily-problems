import java.util.*;
public class leaderArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int arr[]={16,17,4,3,5,2};
        int n=arr.length;

        ArrayList<Integer> ll=new ArrayList<>();

        // Brute Force Approach

        // for(int i=0;i<n;i++){
        //     boolean flag=true;
        //     for(int j=i;j<n;j++){
        //         if(arr[i]<arr[j]){
        //             flag=false;
        //         }
        //     }
        //     if(flag==true){
        //         ll.add(arr[i]);
        //     }
        // }

        // Optimal Approach here
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                ll.add(arr[i]);
                max=arr[i];
            }
        }

        System.out.print(ll);

    }
}
