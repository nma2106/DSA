
import java.util.*;

public class sorted_array {
    public static boolean function(int a[],int i )
    {
        if(i==a.length-1)
        {
            return true;

        }
        if(a[i]>a[i+1])
        {
            return false;
        }
        return function(a, i+1);
    }
    public static void main(String[]args)
    {
        int i;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        int a[] = new int[i];
        for(int j =0;j<i;j++)
        {
            a[j]=sc.nextInt();
        } 
        System.out.println(function(a,0));

    }
    
}
