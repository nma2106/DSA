import java.util.*;

public class Floyd_Traingle {
    public static void function(int a)
    {
        int count =1;
        for(int i =1;i<=a;i++)
        {
            for(int j =1;j<=i;j++)
            {
               System.out.print(count+" ");
               count++;
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

