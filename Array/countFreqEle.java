import java.util.*;
public class countFreqEle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int arr[]={1,2,13,2,1,4,3};
        int n=arr.length;

        int freq[]=new int[256];

        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println(i+"->"+freq[i]);
            }
        }


    }
}
