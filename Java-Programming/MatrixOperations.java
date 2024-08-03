import java.util.Scanner;

public class MatrixOperations 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do 
        {
            // Display menu
            System.out.println("Matrix Operations Menu:");
            System.out.println("1. Sum of Diagonal Elements");
            System.out.println("2. Add Matrices");
            System.out.println("3. Multiply Matrices");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    // Sum of diagonal elements
                    sumOfDiagonalElements(scanner);
                    break;
                case 2:
                    // Add matrices
                    addMatrices(scanner);
                    break;
                case 3:
                    // Multiply matrices
                    multiplyMatrices(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void sumOfDiagonalElements(Scanner scanner) 
    {
        System.out.print("Enter the number of rows (and columns for a square matrix): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // Input matrix elements
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.printf("Element (%d,%d): ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate sum of diagonal elements
        int sumMainDiagonal = 0;
        int sumAntiDiagonal = 0;

        for (int i = 0; i < n; i++) 
        {
            sumMainDiagonal += matrix[i][i];           // Main diagonal
            sumAntiDiagonal += matrix[i][n - 1 - i];   // Anti-diagonal
        }

        // Display results
        System.out.println("Sum of Main Diagonal Elements: " + sumMainDiagonal);
        System.out.println("Sum of Anti-Diagonal Elements: " + sumAntiDiagonal);
    }

    private static void addMatrices(Scanner scanner) 
    {
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        // Input first matrix
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.printf("Element (%d,%d): ", i, j);
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.printf("Element (%d,%d): ", i, j);
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Add matrices
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display result
        System.out.println("Sum of the matrices:");
        printMatrix(result);
    }

    private static void multiplyMatrices(Scanner scanner) 
    {
        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix (and rows for the second matrix): ");
        int cols1Rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int cols2 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][cols1Rows2];
        int[][] matrix2 = new int[cols1Rows2][cols2];
        int[][] result = new int[rows1][cols2];

        // Input first matrix
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) 
        {
            for (int j = 0; j < cols1Rows2; j++) 
            {
                System.out.printf("Element (%d,%d): ", i, j);
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < cols1Rows2; i++) 
        {
            for (int j = 0; j < cols2; j++) 
            {
                System.out.printf("Element (%d,%d): ", i, j);
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Multiply matrices
        for (int i = 0; i < rows1; i++) 
        {
            for (int j = 0; j < cols2; j++) 
            {
                result[i][j] = 0;
                for (int k = 0; k < cols1Rows2; k++) 
                {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display result
        System.out.println("Product of the matrices:");
        printMatrix(result);
    }

    private static void printMatrix(int[][] matrix) 
    {
        for (int[] row : matrix) 
        {
            for (int elem : row) 
            {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }
}
