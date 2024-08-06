import java.util.Scanner;

public class MatrixOperations 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do 
        {
            System.out.println("Menu:");
            System.out.println("1. Addition of Matrices");
            System.out.println("2. Multiplication of Matrices");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    matrixAddition(scanner);
                    break;
                case 2:
                    matrixMultiplication(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 3);

        scanner.close();
    }

    public static void matrixAddition(Scanner scanner) 
    {
        System.out.print("Enter the number of rows and columns of the matrices: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] sum = new int[rows][columns];

        System.out.println("Enter the elements of the first matrix:");
        inputMatrix(scanner, matrix1, rows, columns);

        System.out.println("Enter the elements of the second matrix:");
        inputMatrix(scanner, matrix2, rows, columns);

        // Add matrices
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of the matrices:");
        displayMatrix(sum, rows, columns);
        displayDiagonalSum(sum, rows, columns);
    }

    public static void matrixMultiplication(Scanner scanner) 
    {
        System.out.print("Enter the number of rows and columns of the first matrix: ");
        int rows1 = scanner.nextInt();
        int columns1 = scanner.nextInt();
        System.out.print("Enter the number of columns of the second matrix: ");
        int columns2 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[columns1][columns2];
        int[][] product = new int[rows1][columns2];

        System.out.println("Enter the elements of the first matrix:");
        inputMatrix(scanner, matrix1, rows1, columns1);

        System.out.println("Enter the elements of the second matrix:");
        inputMatrix(scanner, matrix2, columns1, columns2);

        // Multiply matrices
        for (int i = 0; i < rows1; i++) 
        {
            for (int j = 0; j < columns2; j++) 
            {
                product[i][j] = 0;
                for (int k = 0; k < columns1; k++) 
                {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Product of the matrices:");
        displayMatrix(product, rows1, columns2);
        displayDiagonalSum(product, rows1, columns2);
    }

    public static void inputMatrix(Scanner scanner, int[][] matrix, int rows, int columns) 
    {
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static void displayMatrix(int[][] matrix, int rows, int columns) 
    {
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void displayDiagonalSum(int[][] matrix, int rows, int columns) 
    {
        int diagonalSum = 0;
        for (int i = 0; i < Math.min(rows, columns); i++) 
        {
            diagonalSum += matrix[i][i];
        }
        System.out.println("Sum of diagonal elements: " + diagonalSum);
    }
}
