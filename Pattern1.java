import java.util.*;

public class Pattern1 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter rows");
        int iRow = sobj.nextInt();

        System.out.println("Enter Colomn");
        int iCol = sobj.nextInt();

        int iCnt =1;

        for(int i=1;i<=iRow;i++)
        {
            for(int j=1;j<=iCol;j++)
            {
                System.out.print(iCnt+"\t");
                iCnt++;
                if(iCnt==10)
                {
                    iCnt=1;
                }
            }
            System.out.println();
        }
    }    
}
