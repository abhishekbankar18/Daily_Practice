#include<stdio.h>

int main()
{
    int iNo = 0;
    int iMult = 0;

    printf("Enter number\n");
    scanf("%d",&iNo);

    for (int iCnt = 1; iCnt<11;iCnt++)
    {
        iMult = iNo * iCnt;
        printf("%d\t",iMult);
    }
    
    return 0;
}

