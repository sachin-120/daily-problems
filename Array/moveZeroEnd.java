package Array;
import java.util.*;
public class moveZeroEnd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[]={0,10,3,0,0,12,0,5};
        int n=arr.length;

        int temp[]=new int[n];
        int k=0;

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[k]=arr[i];
                k++;
            }
        }

        while(k<n){
            temp[k]=0;
            k++;
        }
        

        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }

    }
}
