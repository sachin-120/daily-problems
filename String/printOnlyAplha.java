import java.util.*;
public class printOnlyAplha{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String str="abc123xyz45";
        int n=str.length();

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int p=(int)ch;
            if(p>=97 && p<=122){
                System.out.print(ch);
            }
        }
        

    }    
}
