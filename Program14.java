import java.util.*;

public class Program14
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string");
        String str = sobj.nextLine();

        Marvellous mobj = new Marvellous();

        mobj.Count(str);

    }
    
}

class Marvellous
{
    public void Count(String s)
    {
        int CapCount = 0;
        int SmallCount = 0;
        int iNumCnt = 0;

        for(int i = 0; i<s.length();i++)
        {
            if((s.charAt(i)>='a')&&(s.charAt(i)<='z'))
            {
                SmallCount++;
            }
            else if((s.charAt(i)>='A')&&(s.charAt(i)<='Z'))
            {
                CapCount++;
            }
            else if((s.charAt(i)>='0')&&(s.charAt(i)<='9'))
            {
                iNumCnt++;
            }
        }

        System.out.println("Number of Small elements are "+SmallCount);
        System.out.println("Number of capital elements are "+CapCount);
        System.out.println("Number elements are "+iNumCnt);
    }
}