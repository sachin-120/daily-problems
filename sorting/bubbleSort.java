public class bubbleSort{
    public static void bubble(int arr[],int n){
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    public static void main(String args[]){
        
        int n=5;
        int arr[]={5,4,3,2,1};

        bubble(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
