
import java.util.*;
public class grid {

    public static int function(int n ,int m, int i, int j)
    {
        //BASE CASE
        if(i==n-1 && j==m-1)
        {
            return 1;
        } else if (i ==n || j == m){
            return 0;
        }
        // RECURSION
        int w1 = function(n, m, i+1, j);
        int w2 = function(n, m, i, j+1);
        int grid = w1+w2;
        return  grid;

    }
    public static void main(String[]args)
    {
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m =  sc.nextInt();
        System.out.println(function(n,m,0,0));

    }
}
