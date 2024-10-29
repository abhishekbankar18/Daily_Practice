import java.util.*;

public class Addition5
{
    int Addition(int iNo1, int iNo2)
    {
        int Ans = 0;
        Ans = iNo1+iNo2;
        return Ans;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        Addition5 aobj = new Addition5();

        System.out.println("Enter number");
        int ivalue1 = sobj.nextInt();

        System.out.println("Enter number");
        int ivalue2 = sobj.nextInt();

        int iRet = aobj.Addition(ivalue1, ivalue2);
        
        System.out.println("Addition is "+iRet);

    }
}