import java.util.*;
public class productOfNumberItself{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[]={1,2,3,4};
        int n=arr.length;

        int ans[]=new int[n];
        
        // With Division Here:-->

        // for(int i=0;i<n;i++){
        //     int product=1;
        //     for(int j=0;j<n;j++){
        //         product*=arr[j];   
        //     }
        //     product=product/arr[i];
        //     ans[i]=product;
        // }

        // With Division Here Brute Force:-->

        int left[]=new int[n];
        int right[]=new int[n];


        for(int i=n-1;i>=0;i--){
             int productLeft=1;
             for(int j=i-1;j>=0;j--){
                productLeft*=arr[j];
             }
             left[i]=productLeft;
        }

        for(int i=0;i<n;i++){
            int productRight=1;
            for(int j=i+1;j<n;j++){
                productRight*=arr[j];
            }
            right[i]=productRight;
        }

        for(int i=0;i<n;i++){
            System.out.print(left[i]+" ");
        }

        System.out.println();
        

        for(int i=0;i<n;i++){
            System.out.print(right[i]+" ");
        }

        for(int i=0;i<n;i++){
            ans[i]=left[i]*right[i];
        }

        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

        

    }
}
