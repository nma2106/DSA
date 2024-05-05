import java.util.*;
public class N_Queens {

    static int count;
    public static void function(char b[][], int row)
    {
        //Base case
        if(row ==b.length)
        {
            print(b);
            count ++;
            return;
        }


        for(int j =0;j<b.length;j++){
           if(isSafe(b,row,j))
           {
            b[row][j] ='Q';
            function(b, row+1);
            b[row][j] = 'X';
           }
        }
    }
    public static boolean isSafe(char b[][], int row, int col) {
        // Check if there is a queen in the same column
        for (int i = 0; i < row; i++) {
            if (b[i][col] == 'Q') {
                return false;
            }
        }
    
        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (b[i][j] == 'Q') {
                return false;
            }
        }
    
        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < b.length; i--, j++) {
            if (b[i][j] == 'Q') {
                return false;
            }
        }
    
        return true; // If no conflicts, it's safe to place a queen
    }
    
    public static void print(char b[][])
    {
        for(int i =0;i<b.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                System.out.print(b[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("///////////////////////////");
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char b[][] = new char[n][n];
        for(int i =0;i<b.length;i++)
        {
            for (int j =0;j<b.length;j++){
                // b[i][j]=sc.next().charAt(0);
                b[i][j]='X';
            }
        }
        function(b,0);
        // print(b);
        System.out.println("Total possible solution is : "+ count);


        

    }
}
