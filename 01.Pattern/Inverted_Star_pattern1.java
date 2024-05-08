import java.util.*;
public class Inverted_Star_pattern1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("take the number of line");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(int j =1;j<=n-i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}