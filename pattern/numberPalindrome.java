import java.util.*;
public class numberPalindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=5;
        int count=0;
        
        for(int i=1;i<=n;i++){

            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            for(int j=2;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();

        }


    }
}