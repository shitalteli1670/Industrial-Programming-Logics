#include<stdio.h>

void Marvellous()
{
    int i = 11;
    auto int j = 21;
    auto int k;

    printf("%d\n",k);
}

int main()
{
    printf("Demonstration of auto storage class...\n");

    Marvellous();

    return 0;
}

/*
    Where the memory gets allocated : stack
    What is the default value : Garbage
    Whats is the scope : Inside Function
    What is the lifetime : Local
*/