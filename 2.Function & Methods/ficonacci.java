import java.util.*;
public class ficonacci {
    public static void func(int n){
        int i =0;
        int a =0;
        int b =1;
        int c;
        while(i<=n)
        {
            c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            i++;
        }
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    func(a);
}    
}
