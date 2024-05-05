import java.util.*;
public class prime {
    /**
     * @param a
     * @return
     */
    public static boolean function(int a)
    {
        boolean is__prime = true;
        for(int i =2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                is__prime=false;
                break;
            }
        }
        return is__prime;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(function(a))
        {
            System.out.println("Prime");
        }
        else{
            System.out.println("Non Prime");
        }
    }
    
}
