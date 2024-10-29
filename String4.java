import java.util.*;

public class String4 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String ");
        String str = sobj.nextLine();

        Marvellous mobj = new Marvellous();

        mobj.Display(str);
    }    
}

class Marvellous
{
    public void Display(String s)
    {
        for(int i =0; i<s.length(); i++)
        {
            System.out.print(s.charAt(i));
        }
    }
}
