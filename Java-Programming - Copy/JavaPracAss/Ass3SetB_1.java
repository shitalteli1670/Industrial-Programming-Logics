import java.io.*;

abstract class order 
{
    protected int id;
    protected String desc;

    order(int i, String d) 
    {
        id = i;
        desc = d;
    }

    public void display() 
    {
        System.out.println("ID: " + id + " Description: " + desc);
    }
}

class Purchase_Order extends order 
{
    String c_name, v_name;

    Purchase_Order(int id, String desc, String c, String v) 
    {
        super(id, desc);
        c_name = c;
        v_name = v;
    }

    public void display() 
    {
        super.display();
        System.out.println("Customer Name: " + c_name + " Vendor Name: " + v_name);
    }
}

class Sales_Order extends order 
{
    String c_name, v_name;

    Sales_Order(int id, String desc, String c, String v) 
    {
        super(id, desc);
        c_name = c;
        v_name = v;
    }

    public void display() 
    {
        super.display();
        System.out.println("Customer Name: " + c_name + " Vendor Name: " + v_name);
    }
}

class Ass3SetB_1 
{
    public static void main(String args[]) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Purchase_Order[] po = new Purchase_Order[3];
        Sales_Order[] so = new Sales_Order[3];

        System.out.println("\nEnter Purchase Order Details");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter ID");
            int id = Integer.parseInt(br.readLine());

            System.out.println("Enter Description");
            String na = br.readLine();

            System.out.println("Enter Customer Name");
            String ca = br.readLine();

            System.out.println("Enter Vendor Name");
            String va = br.readLine();
            
            po[i] = new Purchase_Order(id, na, ca, va);
        }

        System.out.println("\nEnter Sales Order Details");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter ID");
            int id = Integer.parseInt(br.readLine());

            System.out.println("Enter Description");
            String na = br.readLine();

            System.out.println("Enter Customer Name");
            String ca = br.readLine();

            System.out.println("Enter Vendor Name");
            String va = br.readLine();

            so[i] = new Sales_Order(id, na, ca, va);
        }

        System.out.println("\nPurchase Order Details");
        for (int i = 0; i < 3; i++) 
        {
            po[i].display();
        }

        System.out.println("\nSales Order Details");
        for (int i = 0; i < 3; i++) 
        {
            so[i].display();
        }
    }
}
