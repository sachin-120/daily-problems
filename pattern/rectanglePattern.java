package pattern;

import java.util.*;
public class rectanglePattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=5;
        int m=3;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
