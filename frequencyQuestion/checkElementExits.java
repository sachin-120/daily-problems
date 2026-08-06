package frequencyQuestion;

public class checkElementExits{
    public static void main(String args[]){
        
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

        int find=10;

        for(int i=0;i<freq.length;i++){
            if(i==find){
                System.out.print("Element Find:-->");
                return;
            }
        }
        
        System.out.print("Element Doent Exits");
        
        
    }
}
