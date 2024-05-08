import java.util.*;

public class holow_ractangle {
    public static void function(int a , int b)
    {
        for(int i =1;i<=a;i++)
        {
            for(int j =1;j<=b;j++)
            {
                if(i==1||i==a||j==1||j==b)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        function(n,m);
    }
}
