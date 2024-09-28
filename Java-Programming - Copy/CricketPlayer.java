import java.io.*;
class CricketPlayer
{
    String Name;
    int no_of_ings;
    int no_of_notout;
    int total_runs;
    float bat_avg;

    public CricketPlayer()
    {
        Name="";
        no_of_ings=0;
        no_of_notout=0;
        total_runs=0;
        bat_avg=0.0f;
    }
    public CricketPlayer(String n,int i,int o,int r)
    {
        Name=n;
        no_of_ings=i;
        no_of_notout=0;
        total_runs=r;
    }
    public static float avg(int i, int r)
    {
        return i/r;
    }
    public static void sortPlayer(CricketPlayer c[])
    {
        int n=c.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(c[i].bat_avg < c[j].bat_avg)
                {
                    String temp=c[i].Name;
                    int t=c[i].no_of_ings;
                    int e=c[i].no_of_notout;
                    int p=c[i].total_runs;
                    float m=c[i].bat_avg;

                    c[i].Name=c[j].Name;
                    c[i].no_of_ings=c[j].no_of_ings;
                    c[i].no_of_notout=c[j].no_of_notout;
                    c[i].total_runs=c[j].total_runs;
                    c[i].bat_avg=c[i].bat_avg;

                    c[i].Name=temp;
                    c[i].no_of_ings=t;
                    c[i].no_of_notout=0;
                    c[i].total_runs=p;
                    c[i].bat_avg=m;
                }
            }
        }
    }
    void print()
    {
        System.out.println("Name="+Name);
        System.out.println("No_Of_Innings="+no_of_ings);
        System.out.println("No_times_notout"+no_of_notout);
        System.out.println("Total Runs"+total_runs);
        System.out.println("Average"+bat_avg);

        System.out.println("------------------------------");


    }
}
class Ass2setB2
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter How many players");
        int n = Integer.parseInt(br.readLine());
        CricketPlayer cp[] = new CricketPlayer[n];

        System.out.println("Enter player details");

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name,innings,notout,total runs:");
            String na=br.readLine();
            int g=Integer.parseInt(br.readLine());
            int o=Integer.parseInt(br.readLine());
            int t=Integer.parseInt(br.readLine());
            cp[i]=new CricketPlayer(na,g,o,t);
            cp[i].bat_avg=CricketPlayer.avg(t,g);


        }
        CricketPlayer.sortPlayer(cp);
        for(int i=0;i<n;i++)
        cp[i].print();
    }
}