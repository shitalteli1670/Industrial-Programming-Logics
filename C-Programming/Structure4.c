#include<stdio.h>

#pragma pack(1)
struct Student
{
    int RollNo;     // 4
    char Division;  // 1
    int Age;        // 4
    float Marks;    // 4
    int Salary;     // 4
};

int main()
{
    struct Student Amit;

    printf("Size of object is : %d\n",sizeof(Amit));

    return 0;
}