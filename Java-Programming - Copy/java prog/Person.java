import java.util.Scanner;
class Person
{
    String fname,lname,mname;
    public Person(String fname,String mname,String lname)
    {
        this.fname=fname;
        this.mname=mname;
        this.lname=lname;
    }
    public String toString()
    {
        String fnamefirst=fname.substring(0,1);
        String fremainingLetters=fname.substring(1,fname.length());
        fnamefirst=fnamefirst.toUpperCase();
        fname=fnamefirst+fremainingLetters;

        String mnamefirst=fname.substring(0,1);
        String mremainingLetters=fname.substring(1,mname.length());
        mnamefirst=fnamefirst.toUpperCase();
        mname=mnamefirst+mremainingLetters;

        String lnamefirst=lname.substring(0,1);
        String lremainingLetters=lname.substring(1,lname.length());
        lnamefirst=fnamefirst.toUpperCase();
        lname=lnamefirst+lremainingLetters;
        return lname+" "+fname+" "+mname;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First name,Middle name,Last name of the person: ");
        String f=s.next();
        String m=s.next();
        String l=s.next();
        Person p=new Person(f,m,l);
        System.out.println(p);
    }
}