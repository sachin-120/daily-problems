package Array;
import java.util.*;
public class findSecMax{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[]={20,30,50,10,60,45};
        int n=arr.length;

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]!=first && arr[i]>second){
                second=arr[i];
            }
        }

        System.out.print(second);

    }
    
}
