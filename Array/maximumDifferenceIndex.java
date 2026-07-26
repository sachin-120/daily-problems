import java.util.*;
public class maximumDifferenceIndex{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int arr[]={2,1,3,4,2,1,5,1,7};
        int n=arr.length;
        int maxGap=0;
        
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=i;j<n;j++){
                if(arr[i]==arr[j]){
                    temp=j-i;
                    maxGap=Math.max(temp,maxGap);
                }
            }
        }

        System.out.print(maxGap);
        

    }   
}
