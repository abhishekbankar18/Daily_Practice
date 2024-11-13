import java.util.*;

public class Program10 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of array ");
        int iValue = sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);

        aobj.Accept();

        aobj.Display();

        int iRet = aobj.Addition();

        System.out.println("Addition is " + iRet);
    }    
}

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }

    // System.out.println("Eneter elements of array");

    public void Accept()
    {
        System.out.println("Enter elements of array");

        Scanner sobj = new Scanner(System.in);

        for(int i = 0; i<Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of array are");

        for(int i = 0; i<Arr.length;i++)
        {
            System.out.print(Arr[i]+"\t");
        }
        System.out.println();

    }

    int Addition()
    {
        int iSum = 0;

        for(int i = 0; i<Arr.length;i++)
        {
            iSum = iSum + Arr[i];
        }

        return iSum;
    }
}
