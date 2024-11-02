import java.util.*;

public class Add
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter 1 no");
        int iNo1=sobj.nextInt();

        System.out.println("Enter 1 no");
        int iNo2=sobj.nextInt();

        Number nobj = new Number(iNo1, iNo2);

        int ians=nobj.Addition();

        System.out.println("Addition is "+ians);
    }
}

class Number
{
    public int iValue1;
    public int iValue2;

    public Number(int i, int j)
    {
        iValue1=i;
        iValue2=j;
    }

    public int Addition()
    {
        int iAns=0;
        iAns = iValue1 + iValue2;

        return iAns;
    }
}