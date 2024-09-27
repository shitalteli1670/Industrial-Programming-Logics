interface operation
{
    double pi=3.14;
    double area();
    double volume();
}
class Cylinder implements operation
{
    int rad;
    int height;
    Cylinder(int rad, int height)
    {
        this.rad=rad;
        this.height=height;
    }
    public double area()
    {
        System.out.println("\nArea of cylinder :");
        return 2*pi*rad*height+2*pi*Math.pow(rad,2);
    }
    public double volume()
    {
        System.out.println("Volume of Cylinder :");
        return pi*Math.pow(rad,2)*height;
    }
}
public class Ass3SetA_3
{
    public static void main(String args[])
    {
        operation op=new Cylinder(3,4);
        System.out.println(op.area()+"........");
        System.out.println(op.volume()+"........");
    }
}