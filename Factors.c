// Display factors

#include<stdio.h>

void Factors(int iValue)
{
    int iCnt = 0;

    for(iCnt = 1; iCnt<=iValue;iCnt++)
    {
        if((iValue%iCnt)==0)
        {
            printf("%d\t",iCnt);
        }
    }
}

int main()
{
    int iNo = 0;

    printf("Enter no\n");
    scanf("%d",&iNo);

    Factors(iNo);

    return 0;
}