import java.util.*;
public class star_pattern0 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("take the number of line");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
