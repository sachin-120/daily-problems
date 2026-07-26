import java.util.*;
public class equilibiriumPointOptimal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int arr[]={-7,1,5,2,-4,3,0};
        int n=arr.length;

        int totalSum=0;

        for(int i=0;i<n;i++){
            totalSum+=arr[i];
        }

        int left=0;
        int right=0;
        for(int i=1;i<n;i++){
            left+=arr[i-1];

            right=totalSum-left-arr[i];

            if(left==right){
                System.out.print(i);
                return;
            }
        }

        System.out.print(-1);

    }   
}
