import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixTranspose {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read and transpose the first matrix
        System.out.println("Enter number of rows and columns for the first matrix:");
        int rows1 = Integer.parseInt(br.readLine());
        int cols1 = Integer.parseInt(br.readLine());
        
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = Integer.parseInt(br.readLine());
            }
        }
        printTranspose(matrix1);

        // Read and transpose the second matrix
        System.out.println("Enter number of rows and columns for the second matrix:");
        int rows2 = Integer.parseInt(br.readLine());
        int cols2 = Integer.parseInt(br.readLine());
        
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = Integer.parseInt(br.readLine());
            }
        }
        printTranspose(matrix2);
    }

    // Method to print the transpose of a matrix
    private static void printTranspose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        
        // Compute transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print transpose
        System.out.println("Transpose:");
        for (int[] row : transpose) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
