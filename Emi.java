import java.util.*;

public class Emi 
{
    public static void main(String arg[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Size of pattern");
        int iSize = sobj.nextInt();

        for (int i = 1; i <= iSize; i++) 
        {
            for (int j = 1; j <= iSize; j++) 
            {
                 
                if((i==1) || (i==iSize))
                {
                    System.out.print(j+ "\t");
                }
                else if (i + j == (iSize+1)) 
                {
                    System.out.print(" " + "\t");
                }
                else 
                {
                    System.out.print(j + "\t");
                }
            }
            System.out.println();
        }
    }
}
