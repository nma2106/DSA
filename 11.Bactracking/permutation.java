
import java.util.*;
public class permutation {
    public static void function(String s  , String newString)
    {
        //BASE  CASE
        if( s.length()==0)
        {
           
            System.out.println(newString);
            return;
        }
        for(int i =0;i<s.length();i++)
        {
            String n = s.substring(0, i) + s.substring(i+1);
        //RECURSION
       
        function(n,newString + s.charAt(i));

       
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        function(s,"");
    }
}
