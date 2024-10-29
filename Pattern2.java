import java.util.*;

public class Pattern2
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
                if(j%2==0)
                {
                    System.out.print("$\t");
                }
                else
                {
                    System.out.print(j+"\t");
                }
            }
            System.out.println();
        }
    }    
}
