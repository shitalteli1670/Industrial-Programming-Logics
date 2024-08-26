#include <stdio.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <unistd.h>
#include <dirent.h>
#include <fcntl.h>
#include <string.h>
#include <stdlib.h>

void typeline(char *s, char *fn) {
    int handle, i = 0, cnt = 0, n;
    char ch;
    if ((handle = open(fn, O_RDONLY)) == -1) {
        printf("file %s not found\n", fn);
        return;
    }
    if (strcmp(s, "a") == 0) {
        while (read(handle, &ch, 1) != 0)
            printf("%c", ch);
        close(handle);
        return;
    }
    n = atoi(s);
    if (n > 0) {
        while (read(handle, &ch, 1) != 0) {
            if (ch == '\n')
                i++;
            if (i == n)
                break;
            printf("%c", ch);
        }
        printf("\n");
        close(handle);
        return;
    }
    if (n < 0) {
        while (read(handle, &ch, 1) != 0) {
            if (ch == '\n')
                cnt++;
        }
        lseek(handle, 0, SEEK_SET);
        i = 0;
        while (read(handle, &ch, 1) != 0) {
            if (ch == '\n')
                i++;
            if (i == cnt + n - 1)
                break;
        }
        while (read(handle, &ch, 1) != 0)
            printf("%c", ch);
        printf("\n");
        close(handle);
        return;
    }
}

int main() {
    char command[80], t1[20], t2[20], t3[20], t4[20];
    int n;
    system("clear");
    while (1) {
        printf("myshell$ ");
        fflush(stdin);
        fgets(command, 80, stdin);
        n = sscanf(command, "%s %s %s %s", t1, t2, t3, t4);
        switch (n) {
            case 1:
                if (!fork()) {
                    execlp(t1, t1, NULL);
                    perror(t1);
                }
                break;
            case 2:
                if (!fork()) {
                    execlp(t1, t1, t2, NULL);
                    perror(t1);
                }
                break;
            case 3:
                if (strcmp(t1, "typeline") == 0)
                    typeline(t2, t3);
                else {
                    if (!fork()) {
                        execlp(t1, t1, t2, t3, NULL);
                        perror(t1);
                    }
                }
                break;
            case 4:
                if (strcmp(t1, "search") == 0) {
                    // Implement the search function here if needed
                    // search(t2[0], t3, t4);
                } else {
                    if (!fork()) {
                        execlp(t1, t1, t2, t3, t4, NULL);
                        perror(t1);
                    }
                }
                break;
            default:
                printf("Invalid command\n");
        }
    }
    return 0;
}
