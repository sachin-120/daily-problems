import java.util.*;
public class freqChar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String str="sashin";
        char freq[]=new char[256];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            freq[ch]++;
        }

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            System.out.println(ch+"->"+(int)freq[ch]);
        }

        

    }
}
