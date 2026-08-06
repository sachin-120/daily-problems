import java.util.*;
public class removeDuplicate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        HashSet<Character> set=new HashSet<>();

        String str="banana";
        int n=str.length();

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            set.add(ch);
        }

        System.out.print(set);

        boolean[] visited = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!visited[ch]) {
                System.out.print(ch);
                visited[ch] = true;
            }
        }

    }    
}
