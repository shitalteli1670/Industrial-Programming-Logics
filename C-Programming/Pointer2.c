#include<stdio.h>

int main()
{
    char ch = 'A';
    int i = 11;
    float f = 89.99f;
    double d = 90.9999;

    char *cptr = &ch;
    int *iptr = &i;
    float *fptr = &f;
    double *dptr = &d;

    return 0;
}

/*

i               11      
f               89.99
&f              300
&i              200
ch              A
&ch             100
sizeof(ch)      1
sizeof(f)       4
sizeof(d)       8
sizeof(iptr)    8
sizeof(cptr)    8
sizeof(fptr)    8
*iptr           11
*fptr           89.99
*dptr           90.9999
*cptr           A
d               90.9999
sizeof(*cptr)   1
sizeof(*iptr)   4
sizeof(*fptr)   4
sizeof(*dptr)   8









*/