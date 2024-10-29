import java.util.Scanner;

public class String2 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter yur full name");
        String str = sobj.nextLine();

        System.out.println("Character present in your names are "+str.length());
    }    
}
