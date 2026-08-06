package frequencyQuestion;

public class printOnlyUniqueEle{
    public static void main(String args[]){

        int arr[]={1,2,2,3,1,2,4};
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

        for(int i=0;i<freq.length;i++){
            if(freq[i]==1){
                System.out.println(i);
            }
        }
    }
    
}
