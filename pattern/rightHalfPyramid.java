package pattern;
import java.util.*;
public class rightHalfPyramid{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=5;

        for(int i=0;i<n;i++){

            // Spaces

            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }

            //Star
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
            

        }

    }
}
