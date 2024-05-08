import java.util.Scanner;

public class sum_n_nat_nam {
    public static int function(int i)
    {
        if(i==1)
        {
            return 1;

        }
        int sum = i + function(i-1);
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
