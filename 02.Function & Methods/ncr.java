import java.util.*;
public class ncr {
    public static int fun(int a){
        int factorial =1;
        for(int i =1;i<=a;i++)
        {
            factorial = factorial*i;
        }
        return factorial;
    }
    /**
     * @param n
     * @param r
     * @return
     */
    public static int f(int n,int r){
        int nc = fun(n);
        int cr = fun(r);
        int  ncr = fun(n-r);
        int fact_ncr= nc/(cr*ncr);
        return fact_ncr;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ncr = f(n, r);
        System.out.println(ncr);

    }
    
}
