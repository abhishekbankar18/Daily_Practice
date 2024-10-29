import java.util.*;

public class DigitsSum {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        int iRet = nobj.SumDigit(iValue);

        System.out.println("Sum is " + iRet);
    }
}

class Number {
    // public int iNo;

    // public Number(int i) {
    //     iNo = i;
    // }

    int SumDigit(int iNo) 
    {
        int iSum = 0;
        int iDigit = 0;

        while (iNo > 0) 
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        return iSum;
    }
}
