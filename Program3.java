import java.util.*;

public class Program3 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number");
        int iNo2 = sobj.nextInt();

        Arithematic aobj = new Arithematic(iNo1, iNo2);

        int iRet = aobj.Addition();

        System.out.println("Addition is "+iRet);
    }    
}

class Arithematic
{
    public int iValue1;
    public int iValue2;

    public Arithematic(int i, int j)
    {
        iValue1 = i;
        iValue2 = j;
    }

    public int Addition()
    {
        int iSum = 0;

        iSum = iValue1+iValue2;

        return iSum;
    }
}