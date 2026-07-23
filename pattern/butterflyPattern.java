import java.util.*;
public class butterflyPattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=4;

        for(int i=0;i<n;i++){
            
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-2;i>=0;i--){

            //Star

            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            //Spaces

            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }

            
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();

        }
        
    }
}
