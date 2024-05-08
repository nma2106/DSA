import java.util.Scanner;

public class prime_in_range {
   public static boolean function(int a)
    {
        boolean is__prime = true;
        for(int i =2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                is__prime=false;
                break;
            }
        }
        return is__prime;
    }
    public static void range(int a ,int b)
    {
        for(int i =a;i<=b;i++)
        {
            if(function(i))
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        range(a, b);
    }
     
}
