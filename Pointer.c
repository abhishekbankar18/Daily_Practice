#include<stdio.h>


int main()
{
    int No = 10;

    int *p = &No;

    int **q = &p;

    int ***X = &q;

    int ****Y = &X;

    int **a = &p;

    int ***b = &q;

    printf("%d\n",No);
    printf("%d\n",&No);
    printf("%d\n",sizeof(No));
    printf("%d\n",q);
    printf("%d\n",*X);
    printf("%d\n",**b); 
    printf("%d\n",sizeof(b));

    return 0;
}