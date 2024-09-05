
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

class SingleX
{
    public static void main(String A[])
    {
        Base bobj1 = new Base();        // Nocasting
        Derived dobj1 = new Derived();  // Nocasting
        Base bobj2 = new Derived();     // Upcasting (A)
        Derived dobj2 = new Base();     // Downcasting (NA)
    }
}