#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct process_info {
    char pname[20];
    int at, bt, ct, bt1;
    struct process_info *next;
} NODE;

int n;
NODE *first = NULL, *last = NULL;

void accept_info() {
    NODE *p;
    int i;
   
    printf("-------------------------------------\n");
     
    printf("Enter no. of process: ");
    scanf("%d", &n);
   
    for (i = 0; i < n; i++) {
        p = (NODE *)malloc(sizeof(NODE));
       
        printf("-------------------------------------\n");
       
        printf("Enter process name: ");
        scanf("%s", p->pname);
       
        printf("Enter arrival time: ");
        scanf("%d", &p->at);
       
        printf("Enter burst time: ");
        scanf("%d", &p->bt);
       
        printf("-------------------------------------\n");
       
        p->bt1 = p->bt;
        p->next = NULL;
        if (first == NULL)
            first = p;
        else
            last->next = p;
        last = p;
    }
}

void print_output() {
    NODE *p;
    float avg_tat = 0, avg_wt = 0;
   
    printf("pname\tat\tbt\tct\ttat\twt\n");
   
     printf("-----------------------------------------------\n");
   
    p = first;
    while (p != NULL) {
        int tat = p->ct - p->at;
        int wt = tat - p->bt;
       
        avg_tat += tat;
        avg_wt += wt;
       
        printf("%s\t%d\t%d\t%d\t%d\t%d\n", p->pname, p->at, p->bt, p->ct, tat, wt);
        p = p->next;
    }
    printf("Avg TAT=%f\tAVG WT=%f\n", avg_tat / n, avg_wt / n);
   
      printf("-----------------------------------------------\n");
}

void sort() {
    NODE *p, *q;
    int t;
    char name[20];
   
    p = first;
    while (p->next != NULL) {
        q = p->next;
        while (q != NULL) {
            if (p->at > q->at) {
                strcpy(name, p->pname);
                strcpy(p->pname, q->pname);
                strcpy(q->pname, name);
               
                t = p->at;
                p->at = q->at;
                q->at = t;
               
                t = p->bt;
                p->bt = q->bt;
                q->bt = t;
               
                t = p->ct;
                p->ct = q->ct;
                q->ct = t;
               
                t = p->bt1;
                p->bt1 = q->bt1;
                q->bt1 = t;
            }
            q = q->next;
        }
        p = p->next;
    }
}

int time = 0;
NODE *get_sjf() {
    NODE *p, *min_p = NULL;
    int min = 9999;
   
    p = first;
    while (p != NULL) {
        if (p->at <= time && p->bt1 != 0 && p->bt1 < min) {
            min = p->bt1;
            min_p = p;
        }
        p = p->next;
    }
    return min_p;
}

struct gantt_chart {
    int start;
    char pname[30];
    int end;
} s[100], s1[100];

int k = 0;

void sjfnp() {
    int prev = 0, n1 = 0;
    NODE *p;
    while (n1 != n) {
        p = get_sjf();
        if (p == NULL) {
            time++;
            s[k].start = prev;
            strcpy(s[k].pname, "*");
            s[k].end = time;
            prev = time;
            k++;
        } else {
            time += p->bt1;
            s[k].start = prev;
            strcpy(s[k].pname, p->pname);
            s[k].end = time;
           
            prev = time;
            k++;
           
            p->ct = time;
            p->bt1 = 0;
           
            n1++;
        }
        sort();
    }
}

void print_gantt_chart() {
    int i, j, m;
   
    printf("Gantt Chart:\n");
    printf("-------------------------------------\n");
    s1[0] = s[0];
   
    for (i = 1; i < k; i++) {
        if (strcmp(s1[i-1].pname, s[i].pname) == 0) {
            s1[i-1].end = s[i].end;
        } else {
            s1[i] = s[i];
        }
    }
   
    for (i = 0; i < k; i++) {
        m = s1[i].end - s1[i].start;
        for (j = 0; j < m; j++)
            printf("-");
       
        printf("%s", s1[i].pname);
       
        for (j = 0; j < m; j++)
            printf("-");
       
        printf("%d", s1[i].end);
    }
    printf("\n");
}

int main() {
    accept_info();
    sort();
    sjfnp();
    print_output();
    print_gantt_chart();
   
    // Free allocated memory
    NODE *p = first;
    while (p != NULL) {
        NODE *temp = p;
        p = p->next;
        free(temp);
    }
   
    return 0;
}
