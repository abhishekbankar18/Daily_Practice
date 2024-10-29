import java.util.*;

public class CountDigits
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int iValue = sobj.nextInt();

        Number nobj = new Number();
        int iRet = nobj.Digits(iValue);

        System.out.println("Number of digits are "+iRet);

	}
}

class Number
{
    int Digits(int iNo)
    {
        int Count = 0;
        int iDigit = 0;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iNo = iNo/10;
            Count++;
        }

        return Count;
    }
}