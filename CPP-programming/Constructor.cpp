#include<iostream>
using namespace std;

class Arithematic
{
    public:
        int No1;
        int No2;

        Arithematic()
        {
            cout<<"Inside Default constructor\n";
            No1 = 0;
            No2 = 0;
        }
        Arithematic(int A, int B)
        {
            cout<<"Inside Parametrised constructor\n";
            No1 = A;
            No2 = B;
        }
        Arithematic(Arithematic &ref)
        {
            cout<<"Inside copy constructor\n";
            No1 = ref.No1;
            No2 = ref.No2;
        }
        ~Arithematic()
        {
            cout<<"Inside Destructor\n";
        }
};

int main()
{
    Arithematic obj1;
    Arithematic obj2(11,21);
    Arithematic obj3(obj2);
    cout<<obj1.No1<<"\t"<<obj1.No2<<"\n";
    cout<<obj2.No1<<"\t"<<obj2.No2<<"\n";
    cout<<obj3.No1<<"\t"<<obj3.No2<<"\n";

    return 0;
}