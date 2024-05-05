import java.util.*;


public class binary_string {
    
    public static void function(int n, int lastplace, String s)
    {
        if(n==0)
        {
            System.out.println(s);
            return;
        }

        function(n-1, 0, s+="0");
        //if last place is 0 then we need to add 1 as well
        if(lastplace==0)
        {
            function(n-1, 1, s+="1");
        }

    
    }
    
    
    
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        String s = "";
        int n = sc.nextInt();
        int lastplace =sc.nextInt();
        // function(n,lastplace,s);
        function(3,0,s);
    }    
}
