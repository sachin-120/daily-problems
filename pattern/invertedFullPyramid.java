package pattern;
import java.util.*;
public class invertedFullPyramid{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=5;

        for(int i=n-1;i>=0;i--){
            
            //Spaces

            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            //Star  

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            System.out.println();

        }

    }   
}
