import java.util.*;
public class countVowel{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String str="sachinsharma";
        int n=str.length();

        int vowel=0;

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowel++;
            }
        }

        System.out.print(vowel);

    }
}
