import java.util.*;
public class removeDuplicateSortedArr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int arr[]={0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int n=arr.length;
        int k=0;
        
        int i=0;
        int j=1;

        while(j<n){
            if(arr[i]!=arr[j]){
                arr[k]=arr[i];
                k++;
            }
            i++;
            j++;
        }

        arr[k] = arr[n - 1];
        k++;




        for(int p=0;p<k;p++){
            System.out.print(arr[p]+" ");
        }
        

    }
}
