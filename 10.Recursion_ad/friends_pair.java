import java.util.*;
public class friends_pair {
    
    public static int function(int n)
    {
        if(n==1 || n==2)
        {
            return n ;
        }

        // for single choices
        int sc = function(n-1);

        //for pair  standing
        int pair = function(n-2);

        //to make combination from pair

        int pc = (n-1)*pair;

        //total ways
        int ways = sc+pc;
        return ways;
    }
    
    public  static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(function(n));
    }    
}
