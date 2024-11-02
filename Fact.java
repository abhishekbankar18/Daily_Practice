import java.util.Scanner;

public class Fact 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int iNo=sobj.nextInt();

        int iFAct=1;

        for(int i =1;i<=iNo;i++)
        {
            iFAct = iFAct*i;
        }

        System.out.println(iFAct);
    }    
}
