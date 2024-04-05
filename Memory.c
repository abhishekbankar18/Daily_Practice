#include<stdio.h>
#include<stdlib.h>

int main()
{
    int *p = NULL;

    int Arr[5];


    p = (int *)malloc(sizeof(int) * 5);
    printf("Memory is allocated\n");

    printf("Enter numbers\n");
    for(int i = 0; i<=4;i++)
    {
        scanf("%d",&Arr[i]);
    }

    for(int i = 0; i<=4;i++)
    {
        printf("%d\t",Arr[i]);
    }

    free(p);
    printf("Memory Deallocated\n");

    return 0;
}