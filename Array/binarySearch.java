package Array;

import java.util.*;
public class binarySearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int arr[]={10,20,30,40,50,60,70,80};
        int n=arr.length;
        int target=70;

        int left=0;
        int right=n-1;

        while(left<=right){
            if(arr[left]+arr[right]==target){
                System.out.println(left+" "+right);
                left++;
                right--;
            }
            else if(arr[left]+arr[right]>target){
                right--;
            }
            else{
                left++;
            }
        }

    }
    
}
