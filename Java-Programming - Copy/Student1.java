import sy.*;
import ty.*;
import java.io.*;
public class Student1
{
    int roll_no;
    String name;
    SYmarks sym;
    TYmarks tym;
    String Grade;

    public Student1(int r,String na, int c_t, int m_t, int e_t, int t1, int p, String g)
    {
        roll_no=r;
        name=na;
        sym=new SYmarks(c_t,m_t,e_t);
        tym=new TYmarks(t1,p);
        Grade=g;
    }

        public void show(int c_t, int m_t, int e_t, int t1, int p, String g)
        {
            System.out.println("Roll No: "+roll_no);
            System.out.println("Name: "+name);
            System.out.println("SY Computer marks: "+c_t);
            System.out.println("SY Maths marks: "+m_t);
            System.out.println("SY Electronic marks: "+e_t);
            System.out.println("TY Theory marks: "+t1);
            System.out.println("TY Practical marks: "+p);
            System.out.println("Grade: "+g);
        }
        public static void main(String[] args)throws IOException
        {
            String g;
            int n;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter how many students");
            n=Integer.parseInt(br.readLine());
            Student s[]=new Student[n];

            for(int i=0;i<n;i++)
            {
                System.out.println("Enter Roll :");
                int r=Integer.parseInt(br.readLine());

                System.out.println("Enter Name :");
                String na=br.readLine();

                System.out.println("Enter SY Computer marks :");
                int c_t=Integer.parseInt(br.readLine());

                System.out.println("Enter SY Maths marks :");
                int m_t=Integer.parseInt(br.readLine());

                System.out.println("Enter SY Electronic marks :");
                int e_t=Integer.parseInt(br.readLine());

                System.out.println("Enter TY Theory :");
                int t1=Integer.parseInt(br.readLine());

                System.out.println("Enter TY Practical marks :");
                int p=Integer.parseInt(br.readLine());

                double avrg=(c_t+t1+p)/3;
                if(avrg>=70.0)
                {
                    g="A";
                }
                else if(avrg<70.0 && avrg>=60.0)
                {
                    g="B";
                }
                else if(avrg<60.0 && avrg>=50.0)
                {
                    g="C";
                }
                else if(avrg<50.0 && avrg>=40)
                {
                    g="Pass";
                }
                else
                {
                    g="Fail";
                }
                s[i]=new Student1(r,na,c_t,m_t,e_t,t1,p,g);
                s[i].show(c_t,m_t,e_t,t1,p,g);
            
        }
    }
}