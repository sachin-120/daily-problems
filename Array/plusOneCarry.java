import java.util.*;
public class plusOneCarry{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int arr[]={9,9,9};
        int n=arr.length;
        // int carry=0;

        ArrayList<Integer> ll=new ArrayList<>();

        // int temp=arr[n-1];

        int carry=1;

        for(int i=n-1;i>=0;i--){
            int sum=arr[i]+carry;
            arr[i]=sum%10;
            carry=sum/10;

            if(carry==0) break;
        }

         if (carry == 1) {
            int[] ans = new int[n + 1];
            ans[0] = 1;

            for (int i = 0; i < n; i++) {
                ans[i + 1]=arr[i];
            }

            System.out.println(Arrays.toString(ans));
        } else {
            System.out.println(Arrays.toString(arr));
        } 



    }
}
