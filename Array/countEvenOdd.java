package Array;
import java.util.*;
public class countEvenOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int arr[]={1,2,3,4,5,6,7,8};
        int countEven=0;
        int countOdd=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) countEven++;
            else countOdd++;
        }

        System.out.print(countEven+" "+countOdd);
        
    }
}
