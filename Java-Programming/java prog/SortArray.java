class SortArray
{
    public static void main(String args[])
    {
        int ar[]=new int[args.length];
        System.out.println("Array before sort");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=Integer.parseInt(args[i]);
            System.out.println(ar[i]);
        }
        System.out.println("Array After Sort");
        for(int i=0;i<ar.length;i++)
        for(int j=i+1;j<ar.length;j++)
        {
            if(ar[i]>ar[j])
            {
                int t;
                t=ar[i];
                ar[i]=ar[j];
                ar[j]=t;
            }
        }
        for(int i=0;i<ar.length;i++)
        System.out.println(ar[i]);
    }
}