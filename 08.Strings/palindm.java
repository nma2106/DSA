import java.util.*;
public class palindm{


    public static boolean func(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;  // If characters don't match, it's not a palindrome
            }
        }
        return true;  // If the loop completes without returning false, it's a palindrome
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        if(func(n))
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        
    }
}
