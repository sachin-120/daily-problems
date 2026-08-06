public class selectionSort{

    public static void selection(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int mindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[mindex]>arr[j]){
                    mindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mindex];
            arr[mindex]=temp;
        }
    }

    public static void main(String args[]){
        
        int n=5;
        int arr[]={5,4,3,2,1};

        selection(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}