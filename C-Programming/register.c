#include<stdio.h>

void Marvellous()
{
    int i = 11;
    register int j = 21;
    register int k;

    printf("%d\n",k);
}

int main()
{
    printf("Demonstration of register storage class...\n");

    Marvellous();

    return 0;
}

/*
    Where the memory gets allocated : CPU register
    What is the default value : Garbage
    Whats is the scope : Inside Function
    What is the lifetime : Local
*/