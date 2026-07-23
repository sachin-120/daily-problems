package pattern;
import java.util.*;
public class numberRettanglePattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=4;
        int m=3;

        for(int i=0;i<m;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
