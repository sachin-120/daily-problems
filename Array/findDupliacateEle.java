import java.util.*;
public class findDupliacateEle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int arr[]={1,3,4,2,2,5};
        int n=arr.length-1;

        int xor=0;

        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
        }

        for(int i=1;i<=n;i++){
            xor^=i;
        }

        System.out.print(xor);

    }
}
