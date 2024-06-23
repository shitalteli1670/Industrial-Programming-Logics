class Jagged
{
    public static void main(String Arg[])
    {
        int Arr[][] = new int[3][];

        Arr[0] = new int[4];
        Arr[1] = new int[2];
        Arr[2] = new int[5];
       
        Arr[0][0] = 10;
        Arr[0][1] = 11;
        Arr[0][2] = 12;
        Arr[0][3] = 13;

        Arr[1][0] = 14;
        Arr[1][1] = 15;

        Arr[2][0] = 16;
        Arr[2][1] = 17;
        Arr[2][2] = 18;
        Arr[2][3] = 19;
        Arr[2][4] = 20;

        int i =0, j = 0;

        for(i = 0; i< Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}