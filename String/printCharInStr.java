import java.util.*;
public class printCharInStr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String str="sachin";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            System.out.print(ch+" ");
        }

    }
}
