package Array;
import java.util.*;
public class linearSearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int arr[]={10,40,70,90,20,30};
        int target=90;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.print("Found");
                return;
            }
        }
    }
}
