import java.util.*;

public class Armstrong 
{
    public static void main(String arg[])  
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.ArmStrong(iValue);

    } 
}

class Number
{
    public void ArmStrong(int iNo)
    {
        int iCnt = 0;
        int iDigit = 0;
        int iAns = 1;
        int iSum = 0;
        int iTemp = iNo;
        int iTemp2 = iNo;
        
        while(iTemp > 0)
        {
            iCnt++;
            iTemp = iTemp/10;
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            for(int i = 1; i<=iCnt;i++)
            {
                iAns = iAns * iDigit;
            }

            iSum = iSum + iAns;
            iNo = iNo/10;
            iAns=1;
        }

        if(iTemp2==iSum)
        {
            System.out.println("It is Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
