import java.util.*;
public class anagramString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String str1="silent";
        String str2="listen";

        int n=str1.length();

        if(str1.length()!=str2.length()){
            System.out.print("Not A Anagram");
            return;
        }

        // for(int i=0;i<n;i++){
        //     char ch1=str1.charAt(i);
        //     boolean flag=false;
        //     for(int j=0;j<n;j++){
        //         char ch2=str2.charAt(j);

        //         if(ch1==ch2){
        //             flag=true; 
        //         }
        //     }   
        // }

        int freq[]=new int[26];

       for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            freq[ch-'a']++;
       }

       for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            freq[ch-'a']--;
       }

       for(int i=0;i<26;i++){
            if(freq[i]==0){
                System.out.println("Its A Anagram");
                return;
            }
       }

       System.out.print("Not A Anagram");


    }
}
