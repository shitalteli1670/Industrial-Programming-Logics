import java.util.Scanner;

class Exception2
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int Arr[] = {10,20,30,40,50};

        System.out.println("Enter the index number : ");
        int i = sobj.nextInt();

        System.out.println(Arr[i]);
       
        System.out.println("End of code");
    }
}