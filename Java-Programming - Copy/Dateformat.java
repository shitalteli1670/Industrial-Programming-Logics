import java.text.SimpleDateFormat;
import java.util.*;
public class Dateformat
{
    public static void main(String args[])
    {
        Date today=new Date();

        SimpleDateFormat df=new SimpleDateFormat("dd/MM/YYYY");
        String date=df.format(today);
        System.out.println("\nCurrent Date is: "+date);

        df=new SimpleDateFormat("MM-dd-yy");
        date=df.format(today);
        System.out.println("\n Current Date is: "+date);

        df=new SimpleDateFormat("EEEE d MMM YYYY");
        date=df.format(today);
        System.out.println("\n Current Date is: "+date);
        System.out.println("\n Current Date is: "+today);

        df=new SimpleDateFormat("dd/mm/yy HH:mm:ss aaaz");
        date=df.format(today);
        System.out.println("\n Current Date is: "+date);

        df=new SimpleDateFormat("HH:mm:SS");
        date=df.format(today);
        System.out.println("\n Current Date is: "+date);

        df=new SimpleDateFormat("w");
        date=df.format(today);
        System.out.println("\n Current week of the year is: "+date);

        df=new SimpleDateFormat("W");
        date=df.format(today);
        System.out.println("\n Current week of the year is: "+date);

        df=new SimpleDateFormat("D");
        date=df.format(today);
        System.out.println("\n Current Day of the year is: "+date);

        df=new SimpleDateFormat("d");
        date=df.format(today);
        System.out.println("\n Current Day of the year is: "+date);
    }

}