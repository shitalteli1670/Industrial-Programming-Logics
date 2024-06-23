
class Base
{
    public int A,B;
    public Base()
    {
        System.out.println("Derived Constructor");
    }
    void Fun()
    {
        System.out.println("Inside Base fun");
    }
}

class Derived extends Base      // class Derived : public Base
{
    public int X, Y;
    public Derived()
    {
        System.out.println("Derived Destructor");
    }
    void Gun()
    {
        System.out.println("Inside Derived gun");
    }
}



class Single
{
    public static void main(String S[])
    {
        Derived dobj = new Derived();
        dobj.Fun();
        dobj.Gun();
    }
    
}