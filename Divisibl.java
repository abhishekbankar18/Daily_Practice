import java.util.*;

public class Divisibl
{
    boolean Divisible(int iVlue)
    {

        int Ans= iVlue%5;

        if(Ans==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        Divisibl dobj = new Divisibl();

        System.out.println("Enter number");
        int iNo = sobj.nextInt();

        boolean bret = false;

        bret= dobj.Divisible(iNo);

        if(bret==true)
        {
            System.out.println("Divisible");
        }
        else
        {
            System.out.println("Not divisible");
        }
    }
}