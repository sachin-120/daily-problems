import java.util.*;
public class findOutDuplicate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String str="programming";
        int n=str.length();
    
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(str.charAt(i)==str.charAt(j)){
                    flag=true;
                }
            }
            if(flag==true){
                System.out.print(str.charAt(i)+" ");
            }
        }

    }
}
