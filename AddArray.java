import java.util.*;

public class AddArray 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of array");
        int iValue = sobj.nextInt();

        ArrayX aobj =  new ArrayX(iValue);

        aobj.Accpet();

        aobj.Display();

        int iRet = aobj.Addition();

        System.out.println("Addition is "+iRet);
    }    
}

class ArrayX
{
    public int iSize;
    public int Arr[];

    public ArrayX(int iNo)
    {
        iSize = iNo;
    }

    public void Accpet()
    {
        Scanner sobj = new Scanner(System.in);
        Arr = new int[iSize];

        System.out.println(" Enter Elements of array");
        for(int i=0; i <Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

    }

    public void Display()
    {
        System.out.println("Elements of array are ");
        for(int i = 0; i <Arr.length;i++)
        {
            System.out.print(Arr[i]+"\t");
        }
        System.out.println();
    }

    public int Addition()
    {
        int iSum = 0;

        for(int i = 0; i < Arr.length;i++)
        {
            iSum = iSum + Arr[i];
        }

        return iSum;
    }
}