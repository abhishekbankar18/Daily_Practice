import java.util.Scanner;

public class Multiplication
{
    static int Multiplicationx(int iNo1, int iNo2)
    {
        int Ans = 0;
        Ans = iNo1*iNo2;
        return Ans;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Number1");
        int iValue1 = sobj.nextInt();

        System.out.println("Number2");
        int iValue2 = sobj.nextInt();

        int iRet = Multiplicationx(iValue1,iValue2);
        System.out.println("Multiplication is "+iRet);
    }
}