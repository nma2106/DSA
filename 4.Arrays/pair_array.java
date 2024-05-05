import java.util.*;
public class pair_array {
    public static void func(int a[])
    {
        for(int i =0;i<a.length;i++)
        {
            for(int j = i+1;j<a.length;j++)
            {
                System.out.println(a[i]+ " "+a[j]);
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
