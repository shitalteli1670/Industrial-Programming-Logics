class Slip2_1
{
    public static void main(String args[])
    {
        String fname = args[0];
        String lname = args[1];
        int height = Integer.parseInt(args[2]);
        int weight = Integer.parseInt(args[3]);
        float BMI = weight/(height*height);
        System.out.println("BMI is"+BMI);
    }
}