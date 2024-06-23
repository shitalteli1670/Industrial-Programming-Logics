#include<iostream>
using namespace std;

class Arithematic
{
    public:
        int No1;
        int No2;

        Arithematic()
        {
            No1 = 0;
            No2 = 0;
        }
        Arithematic(int A, int B)   // (21,11)
        {
            No1 = A;
            No2 = B;
        }
        int Addition()
        {
            int Ans = 0;
            Ans = No1 + No2;
            return Ans;
        }
        int Substraction()
        {
            int Ans = 0;
            Ans = No1 - No2;
            return Ans;            
        }
};

int main()
{
    int Value1 = 0, Value2 = 0;
    int Ret1 = 0, Ret2 = 0;

    cout<<"Enter first number : \n";    // printf("Enter first number\n");
    cin>>Value1;                        // scanf("%d",&Value1);

    cout<<"Enter second number : \n";
    cin>>Value2;

    Arithematic obj(Value1,Value2);

    Ret1 = obj.Addition();
    cout<<"Addition is : "<<Ret1<<"\n";

    Ret2 = obj.Substraction();
    cout<<"Substraction is : "<<Ret2<<"\n";

    return 0;
}