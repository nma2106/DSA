import java.util.*;

public class zero_one_traingle {
    public static void function(int a)
    {
        int count =1;
        for(int i =1;i<=a;i++)
        {
            for(int j =1;j<=i;j++)
            {
               if((i+j)%2==0)
               {
                System.out.print("1 ");
               }
               else{
                System.out.print("0 ");
               }
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


