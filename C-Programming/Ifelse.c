#include<stdio.h>

int main()
{
    int Standard = 0;

    printf("Enter your standard : \n");
    scanf("%d",&Standard);

    if(Standard == 1)
    {
        printf("Your exam is at 7 AM\n");
    }
    else if(Standard == 2)
    {
        printf("Your exam is at 8 AM\n");       
    }
    else if(Standard == 3)
    {
        printf("Your exam is at 9 AM\n");
    }
    else if(Standard == 4)
    {
        printf("Your exam is at 10 AM\n");
    }
    else
    {
        printf("Wrong standard\n");
    }
    return 0;
}