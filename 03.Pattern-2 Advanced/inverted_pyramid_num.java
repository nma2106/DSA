import java.util.*;

public class inverted_pyramid_num {
    public static void function(int a)
    {
        for(int i =1;i<=a;i++)
        {
            for(int j =1;j<=a-i+1;j++)
            {
               System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int m = sc.nextInt();
        function(n);
    }
}

