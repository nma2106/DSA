import java.util.*;


public class duplicate_in_string {
    
    public static void function(String s,int indx, StringBuilder newstr, boolean map[]  )
    {
        if(indx == s.length())
        {
            System.out.println(newstr);
            return;
        }

        char currchar = s.charAt(indx);
        if(map[currchar-'a']==true)
        {
            function(s, indx+1, newstr, map);
        }
        else
        {
            map[currchar-'a']=true;
            function(s, indx+1, newstr.append(currchar), map);
        }
    }
    
    
    
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        function(s,0,new StringBuilder(""),new boolean[26]);
    }    
}
