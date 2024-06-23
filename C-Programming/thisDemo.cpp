#include<iostream>
using namespace std;

class Arithematic
{
    public:
        int No1;
        int No2;

        Arithematic(int A, int B)   
        {
            No1 = A;
            No2 = B;
        }
        int Addition()  // int Addition(Arithematic * const this)
        {
            int Ans = 0;
            //Ans = No1 + No2;
            Ans = (this->No1) + (this->No2);
            return Ans;
        }
};
int main()
{
    int Ret = 0;
    Arithematic obj(21,11);

    Ret = obj.Addition();   // Ret = Addition(&obj);    Ret = Addition(100);
    cout<<"Addition is : "<<Ret<<"\n";

    return 0;
}