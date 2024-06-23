#include<stdio.h>

int x = 21;

extern int no;

extern void Marvellous();

int main()
{
    printf("Value of x is : %d\n",x);

    printf("Value of no is : %d\n",no);

    Marvellous();

    return 0;
}

/*
    Definations     (Declaration + Defination)
    int no;
    int no = 0;
    int no = 11;

    Declartion
    extern int no;

*/