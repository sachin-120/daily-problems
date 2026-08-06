package frequencyQuestion;
import java.util.*;
public class findLeastEle {
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

        int minFreq=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0 && freq[i]<minFreq){
                minFreq=freq[i];
                ans=i;
            }
        }

        System.out.print(ans);


    } 
}
