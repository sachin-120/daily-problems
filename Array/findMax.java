package Array;
import java.util.*;
public class findMax{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[]={10,40,20,50,70,30};
        int n=arr.length;

        int max=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.print(max);

    }
    
}
