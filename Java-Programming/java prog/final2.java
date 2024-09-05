class Base
{
    public final void gun()
    {
        System.out.println("Inside base Gun");
    }
}

class Derived extends Base
{
    public void gun()       // Error
    {
        System.out.println("Inside derived Gun");
    }
}

class final2
{
    public static void main(String A[])
    {

    }   
}