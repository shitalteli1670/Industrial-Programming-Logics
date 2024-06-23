#include<stdio.h>

struct Demo
{
    int no;
    int data;
};

int main()
{
    struct Demo obj;

    struct Demo *ptr = &obj;
    // . is direct accessing operator
    obj.no = 11;
    // -> is indirect accessing opeartor
    ptr->data = 21;

    return 0;
}