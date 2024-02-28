#include<stdio.h>

void ChkPrime(int iValue)
{
    int iCnt = 0;
    int iNo = 0;

    for(iCnt=1;iCnt<iValue;iCnt++)
    {
        if((iValue%iCnt)==0)
        {
            iNo++;
        } 
    }
    if(iNo == 1)
    {
        printf("It is prime");
    }
    else
    {
        printf("It is not prime number");
    }
}

int main()
{
    int iNo = 0;

    printf("Enter Number\n");
    scanf("%d",&iNo);

    ChkPrime(iNo);

    return 0;
}