import java.util.*;

public class Addition2 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter No1 :");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter No2 :");
        int iNo2 = sobj.nextInt();

        Arithematic aobj = new Arithematic();
        int iAns = aobj.Addition(iNo1, iNo2);

        System.out.println("Addition is : "+iAns);
    }
}

class Arithematic
{
    public int Addition(int i, int j)
    {
        int iSum = 0;
        iSum = i + j;
        return iSum;
    }
}