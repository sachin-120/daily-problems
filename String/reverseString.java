import java.util.*;
public class reverseString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String str="sachin";

        int n=str.length();

        for(int i=n-1;i>=0;i--){
            char ch=str.charAt(i);
            System.out.print(ch+" ");
        }

    }
}
