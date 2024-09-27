import java.util.Scanner;

class CovidPatient extends Exception 
{
    public CovidPatient() 
    {
        System.out.println("Patient is Covid positive");
    }
}

class Patient 
{
    int patient_age, patient_oxy_level, patient_HRCT_report;
    String patient_name;

    public Patient(int patient_age, String patient_name, int patient_oxy_level, int patient_HRCT_report) 
    {
        try 
        {
            this.patient_age = patient_age;
            this.patient_oxy_level = patient_oxy_level;
            this.patient_HRCT_report = patient_HRCT_report;
            this.patient_name = patient_name;
            if (patient_oxy_level < 95 && patient_HRCT_report > 10) 
            {
                throw new CovidPatient();
            }
        } 
        catch (CovidPatient e) 
        {
        }
    }

    @Override
    public String toString() 
    {
        return "Patient name: " + patient_name +
               ", Patient Age: " + patient_age +
               ", Patient Oxygen Level: " + patient_oxy_level +
               ", Patient HRCT Report Score: " + patient_HRCT_report;
    }
}

class Ass4SetA_1 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter patient Age:");
        int pid = sc.nextInt();
       
        sc.nextLine(); 
        System.out.println("Enter patient Name:");
        String pname = sc.nextLine();
       
        System.out.println("Enter Patient Oxygen Level:");
        int o2 = sc.nextInt();
       
        System.out.println("Enter Patient HRCT report:");
        int hrct = sc.nextInt();
       
        Patient p = new Patient(pid, pname, o2, hrct);
        System.out.println(p);
       
        sc.close(); 
    }
}
