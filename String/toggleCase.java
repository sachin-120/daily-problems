import java.util.*;
public class toggleCase{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String str="AAAbbb";
        int n=str.length();
        String ans="";

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int p=(int)ch;
            if(p>=65 && p<=90){
                p=p+32;
                char ch2=(char)p;
                ans+=ch2;
            }
            else{
                p=p-32;
                char ch2=(char)p;
                ans+=ch2;
            }
        }

        System.out.print(ans);
        

    }
}
