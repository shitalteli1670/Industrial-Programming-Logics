#include<iostream>
using namespace std;

class Base
{
    public:
        int A,B;
        Base()
        {   
            cout<<"Inside Base constructor\n";
            A = 11;
            B = 21; 
        }
        ~Base()
        {   cout<<"Inside Base destructor\n";  }
        void Fun()
        {   cout<<"Inside Base fun\n";  }
};
class Derived : public Base
{
    public:
        int X,Y;
        Derived()
        {   
            cout<<"Inside Derived constructor\n";
            X = 51;
            Y = 101;    
        }
        ~Derived()
        {   cout<<"Inside Derived destructor\n";   }
        void Gun()
        {   cout<<"Inside Derived gun\n";   }
};
class DerivedX : public Derived
{
    public:
        int P;
        DerivedX()
        {
            cout<<"Inside DerivedX constructor\n"; 
            P = 111; 
        }
        ~DerivedX()
        {   cout<<"Inside DerivedX destructor\n";  }
        void Sun()
        {   cout<<"Inside Derivedx Sun\n";  }
};

int main()
{
    DerivedX dobj;   // Constructor of Base  Constructor of Derived constructor of Derivedx
    cout<<"Size of object is : "<<sizeof(dobj)<<"\n";   // 20

    cout<<dobj.A<<"\n"; // 11
    cout<<dobj.B<<"\n"; // 21
    cout<<dobj.X<<"\n"; // 51
    cout<<dobj.Y<<"\n"; // 101
    cout<<dobj.P<<"\n"; // 111
    
    dobj.Fun();     // Base Fun
    dobj.Gun();     // Derived Gun
    dobj.Sun();     // Dervedx Sun

    // Destructor of DervedX 
    // Destrcutor of Derived
    // Destructor of Base
    return 0;
}