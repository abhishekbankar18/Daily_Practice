import java.util.*;

public class EvenOdd 
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of array ");
        int iValue = sobj.nextInt();

        ArrayX aobj = new ArrayX();

        System.out.println("Size of array");
        int iRet = aobj.Substraction(iValue);

        System.out.println("Substractiion is "+iRet);
    }    
}

class ArrayX
{

    public int Substraction(int iSize)
    {
       int Arr[] = new int[iSize];

        int iAns = 0;
        int EvenSum = 0;
        int OddSum = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements of array");
        for(int i = 0; i<Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }

        for(int i = 0; i<Arr.length; i++)
        {
            if(Arr[i]%2==0)
            {
                EvenSum = EvenSum + Arr[i];
            }
            else
            {
                OddSum = OddSum + Arr[i];
            }
        }

        iAns = EvenSum - OddSum;

        return iAns;
    }
}