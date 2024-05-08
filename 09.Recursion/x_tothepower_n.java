    
import java.util.Scanner;

public class x_tothepower_n {
    public static int function(int i,int n)
    {
        if(n==0)
        {
            return 1;

        }
        int power = i * function(i,n-1);
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

