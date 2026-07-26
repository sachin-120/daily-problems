import java.util.*;
public class buySellStock{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int arr[]={7, 10, 1, 3, 6, 9, 2};
        int n=arr.length;

        int maxProfit=0;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }

            maxProfit=Math.max(maxProfit,arr[i]-min);
        }

        System.out.print(maxProfit);

    }
}
