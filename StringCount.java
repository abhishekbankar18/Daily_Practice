import java.util.*;

public class StringCount
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string");
        String str = sobj.nextLine();

        Marvellous mobj = new Marvellous();

        mobj.SmallCapCount(str);
    }
}

class Marvellous
{
    public void SmallCapCount(String s)
    {
        int SmallCount = 0;
        int CapCount = 0;
        int iSpace = 0;

        for(int i = 0; i<s.length();i++)
        {
            if((s.charAt(i)>='A')&&(s.charAt(i) <='Z'))
            {
                CapCount++;
            }
            else if((s.charAt(i)>='a')&&(s.charAt(i)<='z'))
            {
                SmallCount++;
            }
            else if(s.charAt(i) == '\0')
            {
                iSpace++;
            }

        }

        System.out.println("Capital count is " +CapCount +" and small count is "+SmallCount);
        System.out.println("White spaces are "+iSpace);
    }
}