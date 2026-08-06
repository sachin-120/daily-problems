import java.util.*;
public class printDigitFromString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String str="abc123xyz45";
        int n=str.length();

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);

            if(ch>=97 && ch<=122){
                continue;
            }

            System.out.print(ch);

        }

    }
}
