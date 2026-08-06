import java.util.*;
public class increAlphabet{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=5;

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int p=65+j;
                System.out.print((char)p);
            }
            System.out.println();
        }

    }
}