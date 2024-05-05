package rec_ad;
import java.util.*;

public class Tilling_problem {

    public static int function(int n)
    {
        if (n ==0||n==1)
        {
            return 1;
        }

        //for horizontal choices
        int hc = function(n-2);

        //for vertical choices 
        int vc = function(n-1);

        // total ways
        int tw = hc+vc;
        return tw;
    }
    public static void main(String[]args)
    {
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(function(n));
    }
}
