
import java.util.*;

public class butterfly {
    public static void function(int a)
    {
        for(int i =1;i<=a;i++)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j =1;j<=2*(a-i);j++)
            {
                System.out.print("  ");
            }
            for(int j =1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int i =a;i>=1;i--)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j =1;j<=2*(a-i);j++)
            {
                System.out.print("  ");
            }
            for(int j =1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int m = sc.nextInt();
        function(n);
    }
}


