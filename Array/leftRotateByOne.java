package Array;
import java.util.*;
public class leftRotateByOne{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int arr[]={10,20,30,40,50};
        int n=arr.length;

        int temp=arr[i];

        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }

        arr[n-1]=temp;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
