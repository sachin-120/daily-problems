import java.util.*;
public class maxConsecutiveOne{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int arr[]={1, 1, 0, 1, 1, 1};
        int n=arr.length;

        int count=0;
        int maxCount=1;

        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                maxCount=Math.max(count,maxCount);
            }
            else{
                count=0;
            }
        }
        System.out.print(maxCount);

    }
}
