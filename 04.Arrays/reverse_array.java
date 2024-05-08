import java.util.*;
public class reverse_array {
    public static void func(int a[])
    {
        int f = 0,l = a.length-1;
        while(f<=l)
        {
            int temp = a[l];
            a[l]=a[f];
            a[f]=temp;
            f++;
            l--;
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
        func(a);
       
         for(int i =0;i<m;i++)
        {
             System.out.println(a[i]);
        }
        
    }
}
