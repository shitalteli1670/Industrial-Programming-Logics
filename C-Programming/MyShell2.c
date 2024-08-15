#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>

void count (char c, char *fn)
{
    int lc=0, wc=0, cc=0;
    char ch;
    FILE *file = fopen(fn, "r");
    if (file == NULL)
    {
        printf("file %s not found\n", fn);
        return;
    }
    while ((ch = fgetc(file)) != EOF)
    {
        cc++;
        if (ch == ' ' || ch == '\n')
            wc++;
        if (ch == '\n')
            lc++;
    }
    fclose(file);
    switch(c)
    {
        case 'c':
            printf("Total No. of characters= %d\n", cc);
            break;

        case 'w':
            printf("Total No. of words= %d\n", wc + 1);  // +1 to include the last word
            break;

        case 'l':
            printf("Total No. of lines= %d\n", lc + 1);  // +1 to include the last line
            break;
    }
}

int main()
{
    char command[80], t1[20], t2[20], t3[20], t4[20];
    int n;
    system("cls");
    while (1)
    {
        printf("MyShell$ ");
        fflush(stdout);
        fgets(command, 80, stdin);
        n = sscanf(command, "%s %s %s %s", t1, t2, t3, t4);
        if (n == 1 || n == 2 || n == 3 || n == 4)
        {
            if (strcmp(t1, "count") == 0 && n == 3)
            {
                count(t2[0], t3);
            }
            else
            {
                STARTUPINFO si;
                PROCESS_INFORMATION pi;
                ZeroMemory(&si, sizeof(si));
                si.cb = sizeof(si);
                ZeroMemory(&pi, sizeof(pi));

                // Create process with command
                if (!CreateProcess(NULL, command, NULL, NULL, FALSE, 0, NULL, NULL, &si, &pi))
                {
                    printf("CreateProcess failed (%d).\n", GetLastError());
                }
                else
                {
                    // Wait until child process exits.
                    WaitForSingleObject(pi.hProcess, INFINITE);

                    // Close process and thread handles.
                    CloseHandle(pi.hProcess);
                    CloseHandle(pi.hThread);
                }
            }
        }
        else
        {
            printf("Invalid command\n");
        }
    }
    return 0;
}
