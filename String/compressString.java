import java.util.*;
public class compressString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String str="aaabbccdd";
        int n=str.length();

        String ans="";
        // boolean flag[]=new boolean[256];

        int count=1;
        
        for(int i=1;i<n;i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                ans+=str.charAt(i-1);
                ans+=count;
                count=1;
            }
        }

        ans += str.charAt(str.length() - 1);
        ans += count;

        System.out.print(ans);

    }
}
