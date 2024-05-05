import java.util.*;
public class largest_number {
    public static void func(int m[])
    {
        int max = Integer.MIN_VALUE;
        for(int i =0;i<m.length;i++)
        {
            if(m[i]>max)
            {
                max=m[i];
            }
            
        }
        System.out.println(max);

    }
    public static void main(String ags[])
    {
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int a[] = new int[m];
        for(int i =0;i<m;i++)
        {
            a[i]= sc.nextInt();
        }
        func(a);
    }
}
