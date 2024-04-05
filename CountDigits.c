// Accept number from user and count number of digits in that number

#include<stdio.h>

int main()
{
    int iNo = 0;
    int iDigit = 0;
    int iCnt = 0;

    printf("ENter number\n");
    scanf("%d",&iNo);

    // if(iNo == 0)
    // {
    //     iCnt =1;
    // };
    // if(iNo < 0)     // Updater
    // {
    //     iNo = -iNo;
    // }

    // while (iNo > 0)
    // {
    //     iDigit = iNo % 10;
    //     iNo = iNo / 10;
    //     iCnt++;
    // }

    if(iNo == 0)       // Filter
    {
        return 1;
    };

    if(iNo < 0)     // Updater
    {
        iNo = -iNo;
    }

    while(iNo > 0)
    {
        iDigit = iNo % 10;
        iNo = iNo / 10;
        iCnt++;
    }
    
    printf("No of digits are %d",iCnt);


    return 0;
}