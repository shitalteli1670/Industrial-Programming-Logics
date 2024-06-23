#include<stdio.h>

int main()
{
    int no = 10;

    printf("Value of no : %d\n",no);

    printf("Address of no : %lu\n",&no);

    printf("Size of no : %d\n",sizeof(no));

    no++;

    printf("Value of no : %d\n",no);

    no--;

    printf("Value of no : %d\n",no);

    return 0;
}

// gcc Operator.c -o Myexe
// Myexe.exe