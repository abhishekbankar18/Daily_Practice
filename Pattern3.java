import java.util.*;

public class Pattern3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter rows");
        int iRow = sobj.nextInt();

        System.out.println("Enter Colomn");
        int iCol = sobj.nextInt();


        for(int i=1;i<=iRow;i++)
        {
            for(int j=1;j<=iCol;j++)
            {
                if(i>=j)
                {
                    System.out.print("$\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }    
}
