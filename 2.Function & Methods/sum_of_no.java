import java.util.*;
public class sum_of_no {
    /**
     * @param args
     */
    public static void sum(int n)
    {
        int sum =0;
        while (n>0) {
            int r = n%10;
            sum = sum+ r;
            n = n/10;
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
