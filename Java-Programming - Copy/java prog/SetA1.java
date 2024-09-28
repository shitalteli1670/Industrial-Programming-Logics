class Employee
{
    int empid,salary;
    String name,dept;
    static int cnt=0;
    public Employee()
    {
        cnt++;
    }
    public Employee(int empid,String name,String dept,int salary)
    {
        this.empid=empid;
        this.name=name;
        this.dept=dept;
        this.salary=salary;
        cnt++;
    }
    public String toString()
    {
        return "empid:"+empid+"Name:"+name+"dept"+dept+"salary:"+salary;
    }
}
class SetA1
{
    public static void main(String args[])
    {
        Employee e1=new Employee(1,"AAAA","computer",20000);
        System.out.println("No of object=+Employee.cnt");
        System.out.println(e1);

        Employee e2=new Employee(2,"BBBB","computer",250000);
        System.out.println("No of object=+Employee.cnt");
        System.out.println(e2);

        Employee e3=new Employee(3,"CCCC","computer",210000);
        System.out.println("No of object=+Employee.cnt");
        System.out.println(e3);

        Employee e4=new Employee(4,"DDDD","computer",30000);
        System.out.println("No of object=+Employee.cnt");
        System.out.println(e4);
    }
}