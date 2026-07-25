import java.util.*;
public class majorityElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[]={2,2,1,2,3,2,2};
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                System.out.print(arr[i]+"->Majority Element Here");
            }
            return;
        }


        System.out.print("-1");


    }
}