import java.util.*;
public class factorial {
    public static int funct(int a)
    {
        int fact=1;
        for(int i =a;i>=1;i--)
        {
            fact = fact*i;
        }
        return fact;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact = funct(a);
        System.out.println(fact);

    }
}
