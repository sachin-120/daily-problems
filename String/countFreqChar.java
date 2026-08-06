import java.util.*;
public class countFreqChar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String str="sachin";
        int n=str.length();

         int freq[]=new int[256];

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);

            freq[ch]++;
        }

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            System.out.println(ch+" "+freq[ch]);
        }

    }
}
