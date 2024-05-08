
    
import java.util.Scanner;

public class x_power_n_optimised {
    public static int function(int i,int n)
    {
        if(n==0)
        {
            return 1;

        }
        int power = function(i,n/2)*function(i,n/2);
        if(n%2!=0)
        {
            power = i*power;
        }
        return power;
    }
    public static void main(String[]args)
    {
        int i,n;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        n = sc.nextInt();
        System.out.println(function(i,n));

    }
    
}


