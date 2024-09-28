import java.util.Scanner;
interface PrintNumber
{
    int PrintCubeNumber();
}
class PrintCube implements PrintNumber
{
    int num;
    PrintCube(int num)
    {
        this.num=num;
    }
    public int PrintCubeNumber()
    {
        return num*num*num;
    }
    public static void main(String[] a)
    {
        PrintNumber p;
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Please Enter any Number :");
        n=sc.nextInt();
        p=new PrintCube(n);
        System.out.println("Cube is :"+p.PrintCubeNumber());
    }
}