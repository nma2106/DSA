import java.util.*;

import javax.swing.plaf.synth.SynthStyle;
public class subarrays_sum {
    public static void funct(int a[])
    {
        for(int i =0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                int sum =0;
                for(int k =i;k<=j;k++)
                {
                    sum = sum + a[k];
                    System.out.print(a[k]);
                }
                System.out.print(" the sum is "+sum);
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
        funct(a);
    }
}
