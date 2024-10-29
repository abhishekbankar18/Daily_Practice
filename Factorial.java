// FActorial of number

import java.util.Scanner;

public class Factorial 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        int iRet = nobj.FactorialX(iValue);

        System.out.println("Factorial is "+iRet);
    }
}

class Number
{
    public int FactorialX(int iNo)
    {
        int iFact = 1;
        // for(int i = iNo; i>0 ;i--)
        // {
        //     iFact = iFact * i;
        // }

        for(int i = 1; i<=iNo ;i++)
        {
            iFact = iFact * i;
        }

        return iFact;
    }
}