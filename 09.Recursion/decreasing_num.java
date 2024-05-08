import java.util.Scanner;

public class decreasing_num {
    public static void function(int i)
    {
        if(i<=0)
        {
            return;
        }
        System.out.println(i);
        i--;
        function(i);

    }
    public static void main(String[]args)
    {
        int i;
        Scanner s = new Scanner(System.in);
        i = s.nextInt();
        function(i);
    }
}
