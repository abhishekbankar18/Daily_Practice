import java.util.*;

public class String3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your name");
        String str = sobj.nextLine();

        for(int i = 0; i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
    }
}