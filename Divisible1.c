// Accept input from user and check it whether is divisible by four & five or not

#include<stdio.h>
#include<stdbool.h>

bool CheckDivisible(int iValue)
{
    if(((iValue%4) ==0) && (iValue%5) == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    int iNo = 0;
    bool bRet = false;

    printf("Enter number\n");
    scanf("%d",&iNo);

    bRet = CheckDivisible(iNo);
    if(bRet == true)
    {
        printf("It is divisible\n");
    }
    else
    {
        printf("It is not divisible\n");
    }

    return 0;

}

