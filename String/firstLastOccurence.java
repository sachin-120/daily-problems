import java.util.*;
public class firstLastOccurence{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String str="sachinsharma";
        char ch='a';

        for(int i=0;i<str.length();i++){
            char ch1=str.charAt(i);

            if(ch1==ch){
                System.out.println("First Occurence:->"+i);
                break;
            }
        }

        for(int i=str.length()-1;i>=0;i--){
            char ch1=str.charAt(i);

            if(ch1==ch){
                System.out.print("last Occurence:->"+i);
                break;
            }
        }






    }
}
