//Print Jay ganesh as many times as user wants

import java.util.*;

public class ForLoop
{
    static void For(int ivalue)
    {
        for(int iCnt = 0; iCnt<ivalue; iCnt++)
        {
            System.out.println("Jay Ganesh...");
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int iNo = sobj.nextInt();

        For(iNo);
    }
}