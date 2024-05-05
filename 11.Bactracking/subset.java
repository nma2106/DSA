import java.util.*;
public class subset {
    public static void function(String s  , String newString, int indx)
    {
        //BASE  CASE
        if(indx == s.length())
        {
            if(newString.length()==0)
            {
                System.out.println("NULL");
            }
            System.out.println(newString);
            return;
        }

        //RECURSION
        //YES CHOICE
        function(s, newString + s.charAt(indx), indx +1);

        //NO CHOICE
        function(s, newString, indx +1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        function(s,"",0);
    }
}
