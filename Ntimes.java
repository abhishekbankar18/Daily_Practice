import java.util.*;

public class Ntimes 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int iValue = sobj.nextInt();

        System.out.println("Enter frequency");
        int iCount = sobj.nextInt();

        Number nobj = new Number();

        nobj.Display(iValue, iCount);
    }    
}

class Number
{
    public void Display(int iNo, int iFrequency)
    {
        if(iFrequency < 0)
        {
            iFrequency = -iFrequency;
        }

        for(int i = 1; i <= iFrequency; i++)
        {
            System.out.print(iNo+"\t");
        }
    }
}