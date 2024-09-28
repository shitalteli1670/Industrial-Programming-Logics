
abstract class Demo
{
    public int Addition(int A, int B)
    {   return A+B; }
    public int Sustraction(int A, int B)
    {   return A-B; }
    public abstract int Multiplication(int A, int B);
}

class Marvellous extends Demo
{
    public int Division(int A, int B)
    {   return A/B; }
    public int Multiplication(int A, int B)
    {   return A*B; }
}

class Hello
{
    public static void main(String A[])
    {
        //Demo obj = new Demo();
        Marvellous mobj = new Marvellous();

        System.out.println(mobj.Addition(10,11));
        System.out.println(mobj.Sustraction(10,11));
        System.out.println(mobj.Multiplication(10,11));
        System.out.println(mobj.Division(10,11));
    }
}