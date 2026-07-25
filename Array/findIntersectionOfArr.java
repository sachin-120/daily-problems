import java.util.*;
public class findIntersectionOfArr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int arr1[]={1,2,3,4,5};
        int arr2[]={2,4,6,8};

        int i=0;
        int j=0;

        int n=arr1.length;
        int m=arr2.length;

        ArrayList<Integer> ll=new ArrayList<>();

        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                ll.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                i++;
            }
        }

        System.out.print(ll);


    }    
}
