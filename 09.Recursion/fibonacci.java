import java.util.Scanner;

public class fibonacci {
    public static int function(int i)
    {
        if(i==1||i==0)
        {
            return 1;

        }
        int sum1= function(i-1);
        int sum0= function(i-2);
        int sum = sum1+sum0;
        return sum;
    }
    public static void main(String[]args)
    {
        int i;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        System.out.println(function(i));

    }
    
}

