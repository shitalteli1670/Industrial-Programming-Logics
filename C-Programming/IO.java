import java.util.Scanner;

class Addition {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int No1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        int No2 = sobj.nextInt();

        int Ans = No1 + No2;

        System.out.println("Addition of two numbers: " + Ans);
    }
}
