import java.util.*; 
public class replaceVowelWithStar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String str="sachinsharma";
        int n=str.length();

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u'){
                str=str.replace(ch,'*');
            }
        }

        System.out.print(str);

    }
}
