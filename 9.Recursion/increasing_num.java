import java.util.Scanner;

public class increasing_num {
    public static void function(int i )
    {
        if(i==1)
        {
            System.out.println(i);
            return;
        }
        
        function(i-1);
        System.out.println(i);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        function(i);
    }
    
}
