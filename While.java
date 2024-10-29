import java.util.Scanner;

public class While
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter no of Iteration");
        int iNo = sobj.nextInt();

        Hello hobj = new Hello();

        hobj.Display(iNo);
    }
}

class Hello
{
    public void Display(int iValue)
    {
        int iCnt = 0;

        iCnt=1;
        while(iCnt<=iValue)
        {
            System.out.println("Jay Ganesh...");
            iCnt++;
        }
    }
}