// Accept number and display even factors
import java.util.*;

public class EvenFactors 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.EvenFactors(iNo);
    }    
}

class Numbers
{
    public void EvenFactors(int iValue)
    {
        int iCnt = 0;

        for(iCnt = 1;iCnt<=iValue;iCnt++)
        {
            if((iValue % iCnt) == 0 && ((iCnt % 2) == 0))
            {
                System.out.println("Even factor is : "+iCnt);
            }
        }
    }
}