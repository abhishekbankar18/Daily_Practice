import java.util.*;

public class ReverseNumber 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();
        int iRet = nobj.Reverse(iValue);

        System.out.println("Reverse number is "+iRet);
    }    
}

class Number
{
    public int Reverse(int iNo)
    {
        int iRev = 0;
        int iDigit = 0;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo/10;
        }

        return iRev;
    }
}