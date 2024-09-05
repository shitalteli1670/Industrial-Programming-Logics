import java.io.*;

class Student2
{
        private int rollno;
        private String sname;
        private float per;
        private static int cnt = 0;

        private Student2(int r,String n, float p)
        {
            rollno = r;
            sname = n;
            per = p;
            cnt++;
        }
        public String toString()
        {
            return "Roll No. :" +rollno + " Name : " + sname + "Percentage: " + per;
        }
        public static void sort(Student2[] s)
        {
            int i, j;
            String tempName;
            int tempRollNo;
            float tempPer;

            for (i = 0; i < s.length; i++)
            {
                for (j = i + 1; j < s.length; j++)
                {
                    if (s[i].per > s[j].per)
                    {
                        tempName = s[i].sname;
                        s[i].sname = s[j].sname;
                        s[j].sname = tempName;

                        tempRollNo = s[i].rollno;
                        s[i].rollno = s[j].rollno;
                        s[j].rollno = tempRollNo;

                        tempPer = s[i].per;
                        s[i].per = s[j].per;
                        s[j].per = tempPer;
                    }
                }
            }
        }

        public static void main(String args[]) throws IOException
        {
            int rno = 1;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter how many students");
            int n = Integer.parseInt(br.readLine());
            Student2[] students = new Student2[n];

            System.out.println("No. of objects =" + Student2.cnt);

            for(int i=0;i<n;i++)
            {
                System.out.println(" Enter the name:");
                String sname = br.readLine();
                System.out.println(" Enter the percentage:");
                float per = Float.parseFloat(br.readLine());
                students[i] = new Student2(rno, sname, per);
                rno++;

            }
            System.out.println("No. of objects=" + Student2.cnt);

            for(int i=0;i<n;i++)
            {
                System.out.println(students[i]);
            }
            sort(students);

            System.out.println("\n\t\t ******Sorted Details are:******");

            for(int i=0;i<n;i++)
            {
                System.out.println(students[i]);
            }
        }
}