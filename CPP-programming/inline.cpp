#include<iostream>
using namespace std;

inline int Addition(int A, int B)
{
    return A + B;
}

int main()
{
    int no1 = 10, no2 = 20, ans = 0;

    ans = Addition(no1, no2);
    // ans = no1 + no2;
    
    cout<<"Addition is : "<<ans<<"\n";

    return 0;
}