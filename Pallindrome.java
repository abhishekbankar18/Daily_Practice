import java.util.*;

public class Pallindrome 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enterr number");
        int iNo = sobj.nextInt();

        Number nobj = new Number();

        boolean bret = nobj.Pallindrome(iNo);
        if(bret==true)
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
    public boolean Pallindrome(int iValue)
    {
        int iTemp = iValue;

        int iDigit=0;
        int iRev=0;

        while(iValue > 0)
        {
            iDigit = iValue%10;
            iRev = (iRev*10)+iDigit;
            iValue = iValue/10;
        }

        if(iTemp==iRev)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}