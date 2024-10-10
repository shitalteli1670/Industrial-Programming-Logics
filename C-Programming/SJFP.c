#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

typedef struct process_info 
{
    char pname[20];
    int at, bt, rt, ct, tat, wt;
} Process;

void accept_info(Process p[], int n) 
{
    for (int i = 0; i < n; i++) {
        printf("\nEnter details for process %d\n", i + 1);
        printf("Process name: ");
        scanf("%s", p[i].pname);
        printf("Arrival time: ");
        scanf("%d", &p[i].at);
        printf("Burst time: ");
        scanf("%d", &p[i].bt);
        
        p[i].rt = p[i].bt; 
    }
}

void print_output(Process p[], int n) 
{
    float total_tat = 0, total_wt = 0;
    printf("\npname\tat\tbt\tct\ttat\twt\n");
    printf("-----------------------------------------\n");

    for (int i = 0; i < n; i++) 
    {
        p[i].tat = p[i].ct - p[i].at;
        p[i].wt = p[i].tat - p[i].bt;
        
        total_tat += p[i].tat;
        total_wt += p[i].wt;
        
        printf("%s\t%d\t%d\t%d\t%d\t%d\n", p[i].pname, p[i].at, p[i].bt, p[i].ct, p[i].tat, p[i].wt);
    }

    printf("-----------------------------------------\n");
    printf("Average TAT: %.2f\n", total_tat / n);
    printf("Average WT: %.2f\n", total_wt / n);
}

void preemptive_sjf(Process p[], int n) 
{
    int complete = 0, time = 0, min_bt = INT_MAX;
    int shortest = 0;
    int finish_time;
    int check = 0;

    while (complete != n) 
    {
        for (int j = 0; j < n; j++) 
        {
            if (p[j].at <= time && p[j].rt < min_bt && p[j].rt > 0) 
            {
                min_bt = p[j].rt;
                shortest = j;
                check = 1;
            }
        }

        if (check == 0) 
        {
            time++;
            continue;
        }
        p[shortest].rt--;
        min_bt = p[shortest].rt;
        if (min_bt == 0) {
            min_bt = INT_MAX;
        }

        // If a process finishes
        if (p[shortest].rt == 0) {
            complete++;
            check = 0;
            finish_time = time + 1;

            // Calculate completion time
            p[shortest].ct = finish_time;
        }

        // Increment time
        time++;
    }
}

int main() {
    int n;

    printf("Enter number of processes: ");
    scanf("%d", &n);

    Process p[n];
    accept_info(p, n);
    preemptive_sjf(p, n);
    print_output(p, n);

    return 0;
}
