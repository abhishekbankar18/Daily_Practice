// Reverse the digits from Number

#include<stdio.h>

int main()
{
    int iNo = 0;
    int iDigit = 0;
    int iRev = 0;

    printf("Enter number\n");
    scanf("%d",&iNo);

    if(iNo<0)
    {
        iNo = -iNo;
    }

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        iRev = (iRev * 10) + iDigit;
        iNo = iNo/10;
    }

    printf("%d",iRev);

    return 0;
}