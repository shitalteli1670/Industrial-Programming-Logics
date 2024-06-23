#include<iostream>
using namespace std;

class Demo
{
    public:
        int X, Y;
        Demo()
        {   
            X = 10;
            Y = 20;
        }
        void fun()          // non constant function
        {
            cout<<"Inside fun\n";
            X++;
            Y++;
        }
        void gun() const    // constant function
        {
            cout<<"Inside gun\n";
            //X++;
            //Y++;
        }
};  

int main()
{
    Demo obj1;
    const Demo obj2;

    obj1.fun();     // normal object normal function
    obj1.gun();     // normal object constant function

    obj2.fun();     // constant object normal function      Not allowed
    obj2.gun();     // constant object constant function

    return 0;
}
