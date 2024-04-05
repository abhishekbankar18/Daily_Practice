// Addition of Non factors

#include<stdio.h>

int main()
{
    int iNo = 0;
    int iCnt = 0;

    int iSum = 0;

    printf("Enter no\n");
    scanf("%d",&iNo);

    for (iCnt = 1; iCnt<=iNo;iCnt++)
    {
        if((iNo%iCnt)!=0)
        {
            iSum = iSum + iCnt;
        }   
    }
    
    printf("Addition is %d\n",iSum);

    return 0;
}