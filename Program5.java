import java.util.*;

public class Program5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.Armstrong(iValue);
    }
}

class Number
{
    public void Armstrong(int iNo)
    {
        int iTemp = iNo;
        int iTemp1 = iNo;
        int iDigit = 0;
        int iCount = 0;
        int iSum = 0;

        while(iTemp1 > 0)
        {
            iCount++;
            iTemp1 = iTemp1/10;
        }

        // System.out.println(iNo);
        // System.out.println(iCount);

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            int iAns = 1;

            for(int i = 1; i<=iCount; i++)
            {
                iAns = iAns * iDigit;
            }

            // System.out.println(iAns);

            iSum = iSum + iAns;

            // System.out.println(iSum);

            iNo = iNo / 10;
        }

        // System.out.println(iSum);

        if(iSum == iTemp)
        {
            System.out.println("it is armstrong number");
        }
        else
        {
            System.out.println("It is not armstrong number");
        }
    }
}