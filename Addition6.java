import java.util.*;

public class Addition6
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter No1 ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter No2 ");
        int iNo2 = sobj.nextInt();

        Arithematic aobj = new Arithematic();
        int iRet=aobj.Addition(iNo1, iNo2);

        System.out.println("Addition is "+iRet);
    }
}

class Arithematic
{
    public int Addition(int iValue1, int iValue2)
    {
        int iAns = 0;
        iAns = iValue1+iValue2;
        return iAns;
    }
}