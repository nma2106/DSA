import java.util.*;
public class Half_pyramid3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("take the number of line");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

    }
}
