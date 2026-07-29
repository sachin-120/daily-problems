import java.util.*;

public class checkPalindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String str="madam";

        StringBuilder sb=new StringBuilder(str);
        sb.reverse();

        if(str.equals(sb.toString())){
            System.out.print("Palindrome:->");
        }
        else{
            System.out.print("Not A Palindrome:->");
        }

    }    
}
