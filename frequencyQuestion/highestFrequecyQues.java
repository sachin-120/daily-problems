package frequencyQuestion;
import java.util.*;
public class highestFrequecyQues{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int arr[]={1,3,1,2,4,5,5,5,5};
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

        int maxFreq=0;
        int ans=-1;

        for(int i=0;i<freq.length;i++){
            if(freq[i]>maxFreq){
                maxFreq=freq[i];
                ans=i;
            }
        }

        System.out.print(ans);


    }
}
