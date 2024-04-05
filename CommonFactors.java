// CommonFactors
import java.util.*;

public class CommonFactors 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first No : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter second no : ");
        int iValue2 = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.CommonFactorsDisplay(iValue1, iValue2);
    }
}

class Numbers
{
    public void CommonFactorsDisplay(int iNo1, int iNo2)
    {
        int iCnt = 0;
        System.out.println("Common factors are : ");
        for(iCnt = 1; (iCnt <= iNo1/2)&&(iCnt <= iNo2/2);iCnt++)
        {
            if((iNo1 % iCnt == 0)&& (iNo2%iCnt==0))
            {
                System.out.println(iCnt);
            }
        }
    }
}