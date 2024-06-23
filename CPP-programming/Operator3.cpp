#include<iostream>
using namespace std;

class Demo
{
    public:
        int A,B;
        Demo(int i, int j)
        {
            A = i;
            B = j;
        }
        





        
        // Demo operator + (Demo *const this, Demo op2)
        Demo operator + (Demo op2)
        {
            cout<<"Inside operator overloading function\n";
            return Demo(this->A + op2.A, this->B + op2.B);
        }


        // Ans = obj1 + obj2;      // obj1.+(obj2);    +(&obj1, obj2)      Member















};

int main()
{
    Demo obj1(10,11);
    Demo obj2(20,21);
    Demo Ans(0,0);

    Ans = obj1 + obj2;      // obj1.+(obj2);    +(&obj1, obj2)      Member
//    Ans = obj1 + obj2;      // +(obj1,obj2);      Non member (Naked)
    
    cout<<Ans.A<<"\t"<<Ans.B<<"\n";

    return 0;
}
