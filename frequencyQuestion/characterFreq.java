package frequencyQuestion;
import java.util.*;
public class characterFreq{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String str="yamaha";
        int n=str.length();

        int freq[]=new int[26];

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);

            freq[ch-'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq[i]>0){
                char ch=(char)('a'+i);
                System.out.println(ch+"->"+freq[i]);
            }
        }

    }
}
