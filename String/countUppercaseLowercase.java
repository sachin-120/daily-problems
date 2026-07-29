import java.util.*;
public class countUppercaseLowercase{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String str="AaBbCcDddA";
        int cvowel=0;
        int cconsonant=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int p=(int)(ch);

            if(p>=97 && p<=122){
                cvowel++;
            }
            else{
                cconsonant++;
            }
        }

        System.out.println(cvowel);
        System.out.println(cconsonant);


    }
}
