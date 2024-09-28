import java.io.*;

class Student 
{
    public static void main(String[] args) 
    throws IOException 
    {
        int rollno, per;
        String class1, name;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Roll No:");
        rollno = Integer.parseInt(br.readLine());

        System.out.println("Enter Name:");
        name = br.readLine();

        System.out.println("Enter Class:");
        class1 = br.readLine(); 

        System.out.println("Enter Percentage:");
        per = Integer.parseInt(br.readLine());

        System.out.println("Roll No\tName\tClass\tPercentage");
        System.out.println(rollno + "\t" + name + "\t" + class1 + "\t" + per);
    }
}
