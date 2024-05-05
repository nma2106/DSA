import java.util.*;
public class print_array {
    public static void func(int a[])
    {
        for(int i =0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String args[])
    {
       
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(m);
        int a[] = new int[m];
        for(int i =0;i<m;i++)
        {
            a[i]= sc.nextInt();
        }
       
        //  for(int i =0;i<m;i++)
        // {
        //      System.out.println(a[i]);
        // }
        func(a);
    }
}
