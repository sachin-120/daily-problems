import java.util.*;
public class basicString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String str="SachinSharma";
        
        System.out.println("Length:->"+str.length());
        System.out.println("CharAtPosition:->"+str.charAt(2));

        String a="sachin";
        String b="Sachin";

        if(a.equals(b)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        System.out.println("IndexOf"+str.indexOf('S'));
        System.out.println("LastIndexOf"+str.lastIndexOf('S'));

        String z="   sachin   ";
        System.out.println(z.trim());
        
        System.out.print("Replace:-->"+str.replace('S', 's'));

        //SplitS:-->

        String p="Sachin sharma santosh";

        String words[]=p.split(" ");

        for(String q:words){
            System.out.println(p);
        }






    }
}