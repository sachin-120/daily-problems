import java.util.*;
public class binaryTriangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=5;
        int count=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2!=0){
                    System.out.print(count);
                }
                else{
                    System.out.print(count-1);
                }
            }
            System.out.println();
        }

    }   
}
