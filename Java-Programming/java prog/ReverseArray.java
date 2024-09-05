import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        int n, i, j = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        n = scanner.nextInt();
        int array[] = new int[n];
        int rev[] = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Reversing the array
        for (i = n - 1; i >= 0; i--) {
            rev[j] = array[i];
            j++;
        }
        
        System.out.println("Reverse of the array is:");
        for (i = 0; i < n; i++) {
            System.out.println(rev[i]);
        }
    }
}
