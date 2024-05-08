
import java.util.*;
public class subarrays {
    public static void func(int a[])
    {
        for(int i =0;i<a.length;i++)
        {
            for(int j = i;j<a.length;j++)
            {
                for(int k = i;k<=j;k++){
                     System.out.print(a[k]);
                }
                System.out.println();
               
            
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int a[] = new int[m];
        for(int i =0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
        func(a);
    }
}

