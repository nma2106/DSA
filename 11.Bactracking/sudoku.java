import java.util.*;
public class sudoku {

    public static boolean function(int a[][],int row,int col)
    {
        //BASE CASE
        if (row ==9)
        {
            return true;
        }

        // RECURSION

        int nextcol =col+1;
        int nextrow = row;
        if(col +1 ==9)
        {
            nextrow = row+1;
            nextcol = 0;
        }

        if(a[row][col]!=0)
        {
            function(a, nextrow, nextcol);
        }

        for(int digit =1; digit <=9;digit ++ )
        {
            if(isSafe(a,row,col,digit))
            {
                a[row][col]=digit;
                if(function(a, nextrow, nextcol))
                {
                    return true;
                }
                a[row][col]=0;
            }
        }

        return false;


    }

    public static boolean isSafe(int a[][], int row, int col, int digit) {
        // Check column
        for (int i = 0; i < 9; i++) {
            if (a[i][col] == digit) {
                return false; // If the digit is found in the same column, return false
            }
        }
        
        // Check row
        for (int j = 0; j < 9; j++) {
            if (a[row][j] == digit) {
                return false; // If the digit is found in the same row, return false
            }
        }

        // Check grid
        int sr = (row / 3) * 3; // Starting row of the subgrid
        int sc = (col / 3) * 3; // Starting column of the subgrid
        for(int i=sr;i<sr+3;i++)
        {
            for(int j = sc;j<sc+3;j++)
            {
                if(a[i][j]==digit)
                {
                    return false;
                }
            }
        }
        
        return true; // If the digit is not found in the same row or column, return true
    }

    public static void print(int a[][])
    {
        for (int i = 0; i < 9; i++) {
            // Iterate over each column in the current row
            for (int j = 0; j < 9; j++) {
                // Print the element at row i and column j
                System.out.print(a[i][j] + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
    
    



    public static void main(String[]args)

    {
        Scanner sc = new Scanner(System.in);
        
        int a[][] = new int[9][9];
        for(int i =0; i<9;i++)
        {
            for(int j =0;j<9;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        if(function(a,0,0))
        {
            print(a);
        }
        else{

            System.out.println("solution doesnot exist");
        }
    }
    
}
