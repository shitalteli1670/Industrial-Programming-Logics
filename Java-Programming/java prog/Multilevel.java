
class Base
{
    public int A,B;
    public Base()
    {
        System.out.println("Base constructor");
    }
    public void Fun()
    {
        System.out.println("Inside Base fun");
    }
}

class Derived extends Base          
{
    public int X,Y;
    public Derived()
    {
        System.out.println("Derived Constructor");
    }
    public void Gun()
    {
        System.out.println("Inside Derived gun");
    }
}

class DerivedX extends Derived
{
    public int P,Q;
    public DerivedX()
    {
        System.out.println("DerivedX Constructor");
    }
    public void Sun()
    {
        System.out.println("Inside DerivedX Sun");
    }
}

class Multilevel
{
    public static void main(String A[])
    {
        DerivedX dobj = new DerivedX();
        dobj.Fun();
        dobj.Gun();
        dobj.Sun();
        
    }   
}