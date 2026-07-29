import java.util.*;
public class countWord{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String str="sachin sharma santosh";
        int count=1;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch==' '){
                count++;
            }
        }

        System.out.print(count);

    }
}
