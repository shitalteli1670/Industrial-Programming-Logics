import java.util.Scanner;

interface PrintNumber {
    void print(int num1);
}

public class PrintSquare {
    public static void main(String[] args) {
        PrintNumber p = n -> System.out.println("Square is: " + n * n);

        // If you want to use a static value:
        // p.print(25);

        // For user input:
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        p.print(num);
        sc.close();
    }
}
