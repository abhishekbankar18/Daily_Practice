import java.util.*;

public class MaxDigit 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        int iret = nobj.Max(iValue);

        System.out.println("Max digit is "+iret);
    }    
}

class Number
{
    public int Max(int iNo)
    {
        int iDigit = 0;
        int iMax = 0;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if(iDigit > iMax)
            {
                iMax = iDigit;
            }
            iNo = iNo/10;
        }

        return iMax;
    }
}