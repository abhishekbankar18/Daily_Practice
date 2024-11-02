import java.util.*;

public class Pattern15
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size");
        int iSize1 = sobj.nextInt();

        System.out.println("Enter size");
        int iSize2 = sobj.nextInt();

        for(int k=1;k<=iSize1;k++)
        {
            for(int l = 1;l<=iSize1;l++)
            {
                for(int i = 1; i<=iSize2; i++)
                {
                    for(int j = 1; j<=iSize2;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.print("\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    } 
    
}