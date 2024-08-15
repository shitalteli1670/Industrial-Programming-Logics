#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

int main() 
{
    int pid;
    int n, num[100], i, j, temp, key;

    printf("Enter the length of the array: ");
    scanf("%d", &n);

    printf("Enter the array:\n");
    for (i = 0; i < n; i++)
        scanf("%d", &num[i]);

    pid = fork();

    if (pid == 0) 
    {  // Child process
        printf("Child process executing bubble sort:\n");
        for (i = 0; i < n; i++) 
        {
            for (j = 0; j < n - i - 1; j++) 
            {
                if (num[j] > num[j + 1]) 
                {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        printf("The sorted array is:\n");
        for (i = 0; i < n; i++) 
        {
            printf("%d ", num[i]);
        }
        printf("\n");
    } 
    else if (pid > 0) 
    {  // Parent process
        wait(NULL);
        printf("Parent process executing insertion sort:\n");
        for (i = 1; i < n; i++) 
        {
            key = num[i];
            j = i - 1;
            while (j >= 0 && num[j] > key) 
            {
                num[j + 1] = num[j];
                j = j - 1;
            }
            num[j + 1] = key;
        }
        printf("The sorted array is:\n");
        for (i = 0; i < n; i++) 
        {
            printf("%d ", num[i]);
        }
        printf("\n");
    } 
    else 
    {
        perror("fork failed");
        return 1;
    }

    return 0;
}
