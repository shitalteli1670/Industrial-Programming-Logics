#include<stdio.h>

int main()
{
    int no = 11;
    int *p = &no;
    int **q = &p;
    int ***x = &q;
    int ****y = &x;
    int *****z = &y;

    return 0;
}

/*
no              11
p               100
x               300
z               500
y               400
q               200
&no             100
&p              200
&z              600
&x              400
&y              500
&q              300
sizeof(no)      4
sizeof(p)       8
sizeof(q)       8
sizeof(x)       8
sizeof(y)       8
sizeof(z)       8
*p              11
***y            100
****z           100
**q             11
***x            11
**x             100
*x              200
*****z          11
****y           11









*/