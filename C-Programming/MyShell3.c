#include <stdio.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <unistd.h>
#include <dirent.h>
#include <fcntl.h>
#include <string.h>

void list(char c, char *dn) {
    DIR *dir;
    int cnt = 0;
    struct dirent *entry;
    struct stat buff;
    
    if ((dir = opendir(dn)) == NULL) {
        printf("Directory %s not found\n", dn);
        return;
    }

    switch (c) {
        case 'f':  // List all files
            while ((entry = readdir(dir)) != NULL) {
                char filepath[1024];
                snprintf(filepath, sizeof(filepath), "%s/%s", dn, entry->d_name);
                if (stat(filepath, &buff) == 0 && S_ISREG(buff.st_mode)) {
                    printf("%s\n", entry->d_name);
                }
            }
            break;

        case 'c':  // Count total entries
            while ((entry = readdir(dir)) != NULL)
                cnt++;
            printf("Total No. of Entries = %d\n", cnt);
            break;

        case 'i':  // List files with inode number
            while ((entry = readdir(dir)) != NULL) {
                char filepath[1024];
                snprintf(filepath, sizeof(filepath), "%s/%s", dn, entry->d_name);
                if (stat(filepath, &buff) == 0 && S_ISREG(buff.st_mode)) {
                    printf("%s (inode: %ld)\n", entry->d_name, buff.st_ino);
                }
            }
            break;

        default:
            printf("Invalid argument...\n");
    }

    closedir(dir);
}

int main() {
    char command[80], t1[20], t2[20], t3[20], t4[20];
    int n;
    
    system("clear");
    
    while (1) {
        printf("MyShell> ");
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
                if (strcmp(t1, "list") == 0)
                    list(t2[0], t3);
                else {
                    if (!fork()) {
                        execlp(t1, t1, t2, t3, NULL);
                        perror(t1);
                    }
                }
                break;

            case 4:
                if (!fork()) {
                    execlp(t1, t1, t2, t3, t4, NULL);
                    perror(t1);
                }
                break;

            default:
                printf("Invalid command...\n");
        }
    }

    return 0;
}
