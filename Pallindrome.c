// Check it is pallindrome or not

#include<stdio.h>

int main()
{
    int iNo = 0;
    printf("Enter number\n");
    scanf("%d",&iNo);
    int iDigit = 0;
    int iRev = 0;
    int iTemp = iNo;

    

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        iRev = (iRev*10)+iDigit;
        iNo = iNo/10;
    }
    if(iRev == iTemp)
    {
        printf("Pallindrome no\n");
    }
    else
    {
        printf("Not Pallindrome\n");
    }

    return 0;
}