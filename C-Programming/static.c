#include<stdio.h>

void Marvellous()
{
    int x = 10;
    x++;
    printf("Value of x is : %d\n",x);
}

int main()
{
    printf("Demonstration of static storage class...\n");

    Marvellous();
    Marvellous();
    Marvellous();

    return 0;
}

/*
    Where the memory gets allocated : CPU register
    What is the default value : Garbage
    Whats is the scope : Inside Function
    What is the lifetime : Local
*/