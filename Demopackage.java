import java.util.*;
import Marvellous.Arithematic;
// import Marvellous.Practice.Loop;

public class Demopackage 
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 20;
        int iNo2 = 10;

        Arithematic aobj = new Arithematic(iNo1, iNo2);

        int iResult = aobj.Addition();
        System.out.println("Addition is : "+iResult);

        iResult = aobj.Substraction();
        System.out.println("Substraction is : "+iResult);

        // Loop lobj = new Loop();
        // lobj.Display();
    }    
}
