import java.util.*;

public class Program7
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of array");
        int iValue = sobj.nextInt();

        ArrayX aobj = new ArrayX();

        aobj.Accept(iValue);
        aobj.Display();
        int iRet = aobj.Addition();

        System.out.println();

        System.out.println("Addition is "+iRet);
    }
}

class ArrayX
{
    public int Arr[];
    public int iSum = 0;

    public void Accept(int iSize)
    {
        Scanner obj = new Scanner(System.in);
        Arr = new int[iSize];

        // int Brr[] = new int[iSize];
        
        for(int i =0; i<iSize;i++)
        {
            Arr[i] = obj.nextInt();
        }
    }

    public void Display()
    {
        for(int i = 0; i<Arr.length; i++)
        {
            System.out.print(Arr[i]+"\t");
        }
    }

    public int Addition()
    {
        for(int i = 0; i<Arr.length;i++)
        {
            iSum = iSum + Arr[i];
        }

        return iSum;
    }
}