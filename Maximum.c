#include<stdio.h>

int main()
{
    int Arr[5] = {10,48,2736,8734,55};
    int iMax = 0;

    for(int iCnt = 0 ; iCnt <= 4 ; iCnt++)
    {
        if(iMax < Arr[iCnt])
        {
            iMax = Arr[iCnt];
        }
    }

    printf("Maximum number is %d",iMax);

    return 0;
}

