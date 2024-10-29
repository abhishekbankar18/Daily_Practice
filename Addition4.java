import java.util.*;

public class Addition4
{
    static int AdditionofNumbers(int iNo1, int iNo2)
    {
        int Ans = 0;
        Ans = iNo1+iNo2;
        return Ans;
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter number ");
        int iValue2 = sobj.nextInt();

        int iRet = 0;

        iRet = AdditionofNumbers(iValue1, iValue2);
        
        System.out.println("Addition is " +iRet);
    }
}