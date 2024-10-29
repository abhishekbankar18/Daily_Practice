import java.util.*;

public class PallindromeNumber 
{
    public static void main(String args[])
    {
        boolean bRet = false;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number ");
        int iValue = sc.nextInt();

        Number nobj = new Number();

        bRet = nobj.Pallindrome(iValue);

        if(bRet == true)
        {
            System.out.println("It is Pallindrome");
        }
        else
        {
            System.out.println("It is not pallindrome");
        }
    }    
}

class Number
{
    public boolean Pallindrome(int iNo)
    {
        int iDigit = 0;
        int iRev = 0;
        int iTemp = iNo;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo/10;
        }

        if(iRev == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
