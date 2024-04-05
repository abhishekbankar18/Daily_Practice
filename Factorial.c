// Factorial of number

#include<stdio.h>

int Factorial(int iValue)
{
    int iFact = 1;
    int iCnt = 0;

    // for(iCnt = 1;iCnt<=iValue;iCnt++)
    // {
    //     iFact = iFact * iCnt;
    // }

    for(iCnt = iValue;iCnt>1;iCnt--)
    {
        iFact = iFact * iCnt;
    }

    return iFact;
}

int main()
{
    int iNo = 0;
    int iRet = 0;

    printf("Enter no.\n");
    scanf("%d",&iNo);

    iRet = Factorial(iNo); 
    printf("Factorial is %d\n",iRet);

    return 0;
}