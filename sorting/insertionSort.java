import java.util.*;
public class insertionSort{
    public static void insertion(int arr[],int n){
    

        for(int i=1;i<n;i++){
            int j=i-1;
            int key=arr[i];
            
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=5;
        int arr[]={5,4,3,2,1};

        insertion(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
