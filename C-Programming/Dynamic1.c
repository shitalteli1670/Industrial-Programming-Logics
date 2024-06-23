#include<stdio.h>
#include<stdlib.h>  // for malloc, calloc, realloc & free

int main()
{
    int Arr[5];     // Static memory allocation

    int Size = 0;
    
    int *ptr = NULL;

    printf("Enter number of elements : \n");
    scanf("%d",&Size);

    ptr = (int *)malloc(Size * sizeof(int));

    // Use the memory

    free(ptr);

    return 0;
}
