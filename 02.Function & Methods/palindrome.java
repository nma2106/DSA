import java.util.*;
public class palindrome {
    /**
     * @param args
     */
    public static void sum(int n)
    {
        int temp = n;
        int sum =0;
        while (n>0) {
            int r = n%10;
            sum = sum *10+ r;
            n = n/10;
        }
        if (sum ==temp)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("non-palindrome");
        }
        System.out.println(sum);
    }
     public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sum(a);
    }
}

