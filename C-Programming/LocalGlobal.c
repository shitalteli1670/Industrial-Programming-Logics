#include<stdio.h>

int x = 101;

void Marvellous()
{
    int i = 21;
    int no = 51;

    printf("From Marvellous value of no is : %d\n",no); // 51
    printf("From Marvellous value of i is : %d\n",i);   // 21
    printf("From Marvellous value of x is : %d\n",x);   // 101
}

int main()
{
    int no = 11;

    printf("From main value of no is : %d\n",no);   // 11
    printf("From main value of x is : %d\n",x); // 101

    Marvellous();

    return 0;
}