import java.util.*;
public class binary_search {
   
    public static void func(int m[],int key)
    {
        
        int start =0,end =m.length-1;
        int mid=(start+end)/2;
        while(start<=end)
        {
            if(key == m[mid])
            {
                System.out.println(m[mid]);
                break;
            }
            else if  (key>m[mid])
            {
                start = mid+1;
            }
            else if (key<m[mid])
            {
                end = mid -1;
            }
        }

    }
    public static void main(String ags[])
    {
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int key =sc.nextInt();
        int a[] = new int[m];
        for(int i =0;i<m;i++)
        {
            a[i]= sc.nextInt();
        }
        func(a,key);
    }
}

