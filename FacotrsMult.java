import java.util.*;

public class FacotrsMult 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();
        
        int iRet = nobj.FacotrsMult(iNo);

        System.out.println("Multiplication is : "+iRet);
    }      
}

class Numbers
{
    public int FacotrsMult(int iNo)
    {
        int iCnt = 0;
        int iMult = 1;

        for(iCnt=1;iCnt<=(iNo/2);iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iMult = iCnt * iMult;
            }
        }

        return iMult;

    }

}