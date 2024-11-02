import java.util.*;

public class Pattern14
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size");
        int iSize = sobj.nextInt();

        for(int i = 1; i<=iSize; i++)
        {
            for(int j = 1; j<=iSize-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    } 
    
}