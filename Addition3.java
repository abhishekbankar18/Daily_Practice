import java.util.*;

public class Addition3 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Firts No1 : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Second No2 :");
        int iNo2 = sobj.nextInt();

        Arithematic aobj = new Arithematic(iNo1,iNo2);
        int iAns = aobj.Addition();
        
        System.out.println("Addition is : "+iAns);
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
        iSum = iValue1 + iValue2;
        return iSum;
    }
}
