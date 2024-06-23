#include<stdio.h>
#include<stdlib.h>  // for malloc, calloc, realloc & free

int main()
{
    int *ptr = NULL;

    ptr = (int *)realloc(NULL, 5 * sizeof(int));        // malloc

    // Use the memory

    
    ptr = (int *)realloc(ptr, 0);        // free

    return 0;
}
