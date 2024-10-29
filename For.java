import java.util.Scanner;

public class For 
{
    void Forloop(int ivalue)
    {
        for(int iCnt=0; iCnt<ivalue;iCnt++)
        {
            System.out.println("Jay Ganesh...");
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        For fobj = new For();

        System.out.println("Number");
        int iNo = sobj.nextInt();

        fobj.Forloop(iNo);
    }    
}
