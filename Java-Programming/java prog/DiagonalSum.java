import java.util.Scanner;

public class DiagonalSum 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows/columns (for a square matrix):");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix row by row:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) 
        {
            primaryDiagonalSum += matrix[i][i]; 
            secondaryDiagonalSum += matrix[i][n - 1 - i]; 
        }

        System.out.println("Sum of primary diagonal elements: " + primaryDiagonalSum);
        System.out.println("Sum of secondary diagonal elements: " + secondaryDiagonalSum);

        scanner.close();
    }
}
