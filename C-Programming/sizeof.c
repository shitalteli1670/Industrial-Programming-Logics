#include<stdio.h>

int main()
{
    char ch = 'A';              // 1 byte
    int i = 11;                 // 4 byte
    float f = 90.89;            // 4 byte
    double d = 90.768459;       // 8 byte
    
    int Arr[5];                 // 20 bytes
    double Brr[5];              // 40 bytes
    float Crr[5];               // 20 bytes
    char Drr[5];                // 5 bytes

    printf("%lu\n",sizeof(ch));
    printf("%lu\n",sizeof(i));
    printf("%lu\n",sizeof(f));
    printf("%lu\n",sizeof(d));
    
    printf("%lu\n",sizeof(Arr));
    printf("%lu\n",sizeof(Brr));
    printf("%lu\n",sizeof(Crr));
    printf("%lu\n",sizeof(Drr));

    printf("%lu\n",sizeof(Arr[0]));
    printf("%lu\n",sizeof(Brr[2]));

    return 0;
}

