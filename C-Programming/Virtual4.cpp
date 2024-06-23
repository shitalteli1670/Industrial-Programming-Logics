#include<iostream>
using namespace std;

class Base
{
    public:
        int A,B;
        void Fun()  // 1000         
        {   cout<<"Base Fun\n"; }
        virtual void Gun()  // 2000         
        {   cout<<"Base Gun\n"; }
        void Sun()  // 3000         
        {   cout<<"Base Sun\n"; }
        virtual void Mun()  // 4000
        {   cout<<"Base Mun\n"; }
};

class Derived : public Base
{
    public:
        int X,Y;
        virtual void Gun()  // 5000         
        {   cout<<"Derived Gun\n";  }
        virtual void Sun()  // 6000         
        {   cout<<"Derived Sun\n";  }
        virtual void Run()  // 7000         
        {   cout<<"Derived Run\n";  }
};

int main()
{
    Derived dobj;
    Base *bp = &dobj;

    bp->Fun();  // Base Fun
    bp->Gun();  // Derived Gun
    bp->Sun();  // Base Sun
    bp->Mun();  // Base Mun
    // bp->Run();  // Error

    return 0;
}