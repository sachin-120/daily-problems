import java.util.*;
public class removeSpace{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String str="sachin sharma santosh";
        int n=str.length();

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);

            if(ch!=' '){
                System.out.print(ch);
            }
        }

    }
}