import java.util.*;
public class equilirbiumPoint{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int arr[]={1,2,0,3};
        int n=arr.length;

        for(int i=0;i<n;i++){
            int left=0;
            int right=0;
            
            for(int j=0;j<i;j++){
                left+=arr[j];
            }
            
            for(int j=i+1;j<n;j++){
                right+=arr[j];
            }
            
            if(left==right){
                System.out.print(i);
                return;
            }
        }

        System.out.println(-1);
        

    }   
}
