
import java.util.*;
public class factorial {
    public static int func(int a)
    {
        if(a ==1)
        {
            return 1;
        }
        int fnm1 = func(a-1);
        int f = a*fnm1;
        return f;
    }
public static void main (String[ ]args)
{
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(func(a));
    
}    
}
