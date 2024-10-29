import java.util.*;

public class AdditionConstructer
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter No1 ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter No2 ");
        int iNo2 = sobj.nextInt();

        Arithematic aobj = new Arithematic(iNo1,iNo2);
        int iRet = aobj.Addition();

        System.out.println("Addition is "+iRet);
    }
}

class Arithematic
{
    public int iValue1 = 0;
    public int iValue2 = 0;

    public Arithematic(int i, int j)
    {
        iValue1 = i;
        iValue2 = j;
    }

    public int Addition()
    {
        int iAns = 0;
        iAns = iValue1+iValue2;
        return iAns;
    }
}