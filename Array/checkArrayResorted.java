package Array;
import java.util.*;
public class checkArrayResorted{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int arr[]={2,4,6,8,10};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.print("No");
                break;
            }
        }

        System.out.print("Yes");

    }
}
