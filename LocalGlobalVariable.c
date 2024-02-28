#include<stdio.h>

int X = 11;

void Demo()
{
    int B = 12;

    printf("B from Demo %d\n",B);
    printf("X from Demo %d\n",X);
}

int main()
{
    int A = 10;

    printf("A from Main %d\n",A);
    printf("X from main %d\n", X);

    Demo();

    return 0;
}
