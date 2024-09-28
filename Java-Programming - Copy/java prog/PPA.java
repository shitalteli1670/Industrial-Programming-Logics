import Marvellous.Arithematic;
import Infosystems.Mathematics;

class PPA
{
    public static void main(String Arg[])
    {
        Arithematic aobj = new Arithematic();
        Mathematics mobj = new Mathematics();

        System.out.println(aobj.Addition(11,10));
        System.out.println(aobj.Substraction(11,10));

        System.out.println(mobj.Multiplication(11,10));
        System.out.println(mobj.Division(110,11));
    }
}