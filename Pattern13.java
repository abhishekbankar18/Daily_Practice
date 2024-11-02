import java.util.*;

public class Pattern13 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size");
        int iSize = sobj.nextInt();

        for(int i = 1; i<=iSize; i++)
        {
            for(int j = 1; j<=iSize;j++)
            {
                if((i==1) || (j==1) || (i==iSize) || (j==iSize))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } 
    
}