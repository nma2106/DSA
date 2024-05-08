import java.util.*;

public class linear_search {
    public static void func(int a[],int key) {
        for (int i = 0; i < a.length; i++) {
           if (a[i]==key)
           {
                System.out.println(a[i]);
                System.out.println("hello the index is " + i);
           }
  
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int key = sc.nextInt();
        System.out.println(m);
        int a[] = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        func(a,key);
    }
}

