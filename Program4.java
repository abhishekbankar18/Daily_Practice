// Display even factors

import java.util.*;

public class Program4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int iNo = sobj.nextInt();

        Number nobj = new Number();

        nobj.Factors(iNo);

    }
}

class Number
{
    void Factors(int iValue)
    {
        for(int i = 1; i<=iValue/2;i++)
        {
            if((i%2==0)&&(iValue%i==0))
            {
                System.out.println(i);
            }
        }
    }
}