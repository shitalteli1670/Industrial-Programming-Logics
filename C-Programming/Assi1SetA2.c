#include <stdio.h>

#ifdef _WIN32
#include <windows.h>
#else
#include <unistd.h>
#endif

int main() {
    #ifdef _WIN32
    printf("Running on Windows\n");
    // Windows-specific code
    #else
    printf("Running on Unix/Linux\n");
    pid_t pid = fork();
    if (pid == 0) {
        printf("Child process\n");
    } else {
        printf("Parent process\n");
    }
    #endif
    return 0;
}
