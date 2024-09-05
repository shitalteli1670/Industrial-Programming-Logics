
class OOP
{
    public static void main(String Arg[])
    {
        Arithematic obj1 = new Arithematic();
        Arithematic obj2 = new Arithematic(21,11);

        int Ret = 0;
        
        Ret = obj2.Addition();
        System.out.println(Ret);        // 32
        
        Ret = obj2.Substraction();
        System.out.println(Ret);        // 10
    }
}

class Arithematic
{
    public int No1;
    public int No2;

    public Arithematic()
    {
        System.out.println("Inside Default constructor");
        this.No1 = 0;
        this.No2 = 0;
    }
    public Arithematic(int A, int B)
    {
        System.out.println("Inside Parametrised constructor");        
        this.No1 = A;
        this.No2 = B;
    }
    public int Addition()
    {
        int Ans = 0;
        Ans = No1 + No2;
        return Ans;
    }
    public int Substraction()
    {
        int Ans = 0;
        Ans = No1 - No2;
        return Ans;
    }

}