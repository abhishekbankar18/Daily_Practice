import java.util.Scanner;

public class Pattern11
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of Rows");
        int iRow = sobj.nextInt();

        System.out.println("Enter size of columns");
        int iCol=sobj.nextInt();

        PatternX pobj = new PatternX();

        pobj.pattern(iRow, iCol);

    }    
}

class PatternX
{
    public void pattern(int iRow, int iCol)
    {
        int k = 1;
        for(int i = 1; i<=iRow;i++)
        {
            for(int j =1; j<=iCol;j++)
            {
                
                System.out.print(k+" \t");
                k++;
                if(k>9)
                {
                    k=1;
                }
                
            }
            System.out.println();
        }
    }
}