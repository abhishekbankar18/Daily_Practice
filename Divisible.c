// Accept number from user and check whether it is divisible by 5 or not

#include<stdio.h>

int ChkDivisible(int iValue)
{
    if((iValue%5) == 0)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int main()
{
    int iNo = 0;
    int iRet = 0;

    printf("Enter no \n");
    scanf("%d",&iNo);

    iRet = ChkDivisible(iNo);

    if(iRet == 1)
    {
        printf("It is Divisible by 5\n");
    }
    else
    {
        printf("It is not Divisible by 5\n");
    }

    return 0;
}
