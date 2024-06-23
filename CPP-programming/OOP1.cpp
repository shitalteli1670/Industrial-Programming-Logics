#include<iostream>
using namespace std;

// Class Declaration
class Demo
{
    public: // Access Specifier
        int no1;    // Characterictics
        int no2;    // Characterictics

        Demo()      // Constructor
        {
            cout<<"Inside Constructor\n";
            no1 = 11;
            no2 = 21;
        }
        ~Demo()     // Destructor
        {
            cout<<"Inside Destructor\n";
        }
        void Fun()  // Behaviour
        {
            cout<<"Inside Fun of Demo class\n";
        }
};

int main()
{
    cout<<"Inside main\n";
    Demo obj1;
    cout<<"Size of object is : "<<sizeof(obj1)<<"\n";
    cout<<"Value of no1 : "<<obj1.no1<<"\n";
    cout<<"Value of no2 : "<<obj1.no2<<"\n";
    obj1.Fun();

    return 0;
}