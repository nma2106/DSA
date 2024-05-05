
import java.util.*;

public class last_occurance {
    public static int function(int a[],int i,int key )
    {
        if(i==0)
        {
            return -1;

        }
        if(a[i]==key)
        {
            return i;
        }
        return function(a, i-1,key);
    }
    public static void main(String[]args)
    {
        int i,key;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        key = sc.nextInt();
        int a[] = new int[i];
        for(int j =0;j<i;j++)
        {
            a[j]=sc.nextInt();
        } 
        System.out.println(function(a,i-1,key));

    }
    
}
