import java.util.Scanner;

public class MatrixTranspose 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int r, c;

        // Input matrix dimensions
        System.out.print("Enter the number of rows: ");
        r = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        c = scanner.nextInt();

        int[][] matrix = new int[r][c];
        int[][] transpose = new int[c][r];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display transpose
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < c; i++) 
        {
            for (int j = 0; j < r; j++) 
            {
                System.out.println(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
