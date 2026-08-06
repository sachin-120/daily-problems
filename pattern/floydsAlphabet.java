import java.util.*;
public class floydsAlphabet{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=5;
        int k=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int p=65;
                System.out.print((char)(p+k));
                k++;
            }
            System.out.println();
        }

    }
}
