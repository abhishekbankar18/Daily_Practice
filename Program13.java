import java.util.*;

public class Program13 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string");
        String str = sobj.nextLine();

        Marvellous mobj = new Marvellous();

        mobj.Display(str);

    }
    
}

class Marvellous
{
    public void Display(String s)
    {
        for(int i = 0; i<s.length();i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}