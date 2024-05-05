
import java.util.*;

public class solid_rhombus {
    public static void function(int a)
    {
        for(int i =1;i<=a;i++)
        {
            for(int j =1;j<=a-i;j++)
            {
               System.out.print("  ");
            }
            for(int j =1;j<=a;j++)
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

