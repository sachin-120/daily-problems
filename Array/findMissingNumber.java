import java.util.*;
public class findMissingNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[]={1,2,3,5};
        int n=arr.length+1;

        // int xor=1;

        // for(int i=0;i<n;i++){
        //     xor^=arr[i];
        // }

        // System.out.print(xor);

        int sum=n*(n+1)/2;
        int sum2=0;

        for(int i=0;i<arr.length;i++){
            sum2+=arr[i];
        }

        System.out.print(sum-sum2);

    }
}