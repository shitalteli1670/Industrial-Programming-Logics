#include<stdio.h>

int main()
{
    int Arr[4][5];

    Arr[2][2] = 11;
    Arr[0][3] = 21;
    Arr[1][4] = 51;
    Arr[3][3] = 101;
    Arr[2][1] = 111;
    Arr[3][0] = 121;
    Arr[3][4] = 151;
    Arr[1][2] = 201;

    printf("%d\n",Arr[1][4]);
    printf("%d\n",Arr[3][3]);
    printf("%d\n",Arr[1][2]);
    printf("%d\n",Arr[0][3]);
    
    return 0;
}