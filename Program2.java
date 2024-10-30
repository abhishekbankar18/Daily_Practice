import java.util.*;

public class Program2 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number");
        int iNo2 = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        int iRet = aobj.Addition(iNo1, iNo2);

        System.out.println("Addition of "+iNo1+ " and " +iNo2+ " is "+iRet);
    }    
}

class Arithematic
{
    public int Addition(int i, int j)
    {
        int iAns = 0;
        iAns = i + j;
        return iAns;
    }
}