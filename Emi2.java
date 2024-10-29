import java.util.*;

public class Emi2 
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
                if((i==1) || (j==iSize) || (i==j) ||(j==1) || (i==iSize))
                {
                    System.out.print(j+ "\t");
                }
                else 
                {
                    System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }
}

