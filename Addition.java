import java.util.*;

public class Addition 
{
    static int Addition(int i , int j)
    {
        int iSum = 0;
        
        iSum = i + j;

        return iSum;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter No1 : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter No2 : ");
        int iNo2 = sobj.nextInt();

        int iAns = Addition(iNo1, iNo2);

        System.out.println("Addition is : "+iAns);
    }    
}
