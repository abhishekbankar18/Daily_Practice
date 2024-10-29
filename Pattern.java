import java.util.Scanner;

class Pattern
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Rows ");
        int i = sobj.nextInt();

        System.out.println("Enter colomn ");
        int j = sobj.nextInt();

        PatternX pobj = new PatternX();

        pobj.Display(i, i);
    }
}

class PatternX
{
    public void Display(int iRow, int iCol)
    {
        for(int i = 1; i<=iRow;i++)
        {
            for(int j =1; j<=iCol;j++)
            {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}