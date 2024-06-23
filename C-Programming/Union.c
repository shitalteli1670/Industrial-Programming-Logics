#include<stdio.h>

#pragma pack(1)
struct Demo
{
    int no;     // 4
    float f;    // 4
    int data;   // 4
    char ch;    // 1
};              // 13

union Hello
{
    int no;     // 4
    float f;    // 4
    int data;   // 4
    char ch;    // 1
};              // 4

int main()
{
    struct Demo dobj;
    union Hello hobj;

    printf("Size of structure is : %d\n",sizeof(dobj)); // 13
    printf("Size of Union is : %d\n",sizeof(hobj)); // 4

    hobj.no = 11;
    printf("%d\n",hobj.no);

    hobj.data = 21;
    printf("%d\n",hobj.no); // 21
    printf("%d\n",hobj.data);   // 21

    return 0;
}