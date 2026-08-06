package frequencyQuestion;
import java.util.*;
public class findFirstRepeating{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int arr[]={2,6,4,1,3,6,2,5,1,4};
        int n=arr.length;

         int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int freq[]=new int[max+1];

        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }

        for(int i=0;i<n;i++){
            if(i>1){
                System.out.print(i+" ");
                break;
            }
        }

    }
}
