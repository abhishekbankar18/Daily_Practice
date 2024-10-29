import java.util.Scanner;

public class Divisible
{
    static int DivisibleByFiveandThree(int iValue)
    {
        if(((iValue%3==0))&&((iValue%5)==0))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Number");
        int iNo = sobj.nextInt();

        int iRet = DivisibleByFiveandThree(iNo);

        if(iRet==1)
        {
            System.out.println("Divisible");
        }
        else
        {
            System.out.println("Not Divisible");
        }
    }
}