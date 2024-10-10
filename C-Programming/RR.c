#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Process 
{
    char pname[5];
    int AT, BT, TAT, WT, CT;
    int tempBT;
} P[10];

int N;
int TQ;

void Input() 
{
    int i;
    printf("\nEnter Number of processes: ");
    scanf("%d", &N);

    for (i = 0; i < N; i++) 
    {
        printf("\nEnter details of process %d\n", i + 1);
        printf("Enter process name: ");
        scanf("%s", P[i].pname);

        printf("Enter arrival time: ");
        scanf("%d", &P[i].AT);

        printf("Enter burst time: ");
        scanf("%d", &P[i].BT);

        P[i].tempBT = P[i].BT;
    }

    printf("Enter Time Quantum: ");
    scanf("%d", &TQ);
}

void SortProcessAT() {
    int i, j;
    struct Process temp;
    for (i = 0; i < N - 1; i++) 
    {
        for (j = i + 1; j < N; j++) 
        {
            if (P[i].AT > P[j].AT) 
            {
                temp = P[i];
                P[i] = P[j];
                P[j] = temp;
            }
        }
    }
}

void RR() 
{
    int time = 0;
    int finish = 0;
    int i, flag;

    while (finish != 1) {
        flag = 0;
        for (i = 0; i < N; i++) {
            if (P[i].AT <= time && P[i].tempBT > 0) 
            {
                flag = 1;
                printf("%d %s ", time, P[i].pname);
                if (P[i].tempBT > TQ) {
                    time += TQ;
                    P[i].tempBT -= TQ;
                } else {
                    time += P[i].tempBT;
                    P[i].tempBT = 0;
                    P[i].CT = time;
                }
                printf("%d | ", time);
            }
        }

        if (flag == 0) 
        {
            time++;
        }

        finish = 1;
        for (i = 0; i < N; i++) 
        {
            if (P[i].tempBT > 0) 
            {
                finish = 0;
                break;
            }
        }
    }
}

void Output() 
{
    int i;
    int totalTAT = 0;
    int totalWT = 0;

    printf("\nProcess Details ");
    printf("\n--------------------------------------------");
    printf("\nPName\tAT\tBT\tTAT\tWT");
    printf("\n--------------------------------------------");

    for (i = 0; i < N; i++) {
        P[i].TAT = P[i].CT - P[i].AT;
        P[i].WT = P[i].TAT - P[i].BT;
        totalTAT += P[i].TAT;
        totalWT += P[i].WT;

        printf("\n%s\t%d\t%d\t%d\t%d", P[i].pname, P[i].AT, P[i].BT, P[i].TAT, P[i].WT);
    }

    printf("\n---------------------------------------------\n");
    printf("Average TAT: %.2f\n", (float)totalTAT / N);
    printf("Average WT: %.2f\n", (float)totalWT / N);
}

int main() 
{
    Input();
    SortProcessAT();
    RR();
    Output();
    return 0;
}
