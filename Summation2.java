import java.util.*;


public class Summation2 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Size of Array");
        int iSize = sobj.nextInt();

        Arithematic aobj = new Arithematic(iSize);

        aobj.Accept();

        aobj.Display();

        aobj.Summation();
    }    
}

class Arithematic
{
    public int Arr[];

    public Arithematic(int iNo)
    {
        Arr = new int[iNo];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements of array");
        for(int i = 0; i<Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        for(int i =0; i<Arr.length;i++)
        {
            System.out.println(Arr[i]+"\t");
        }
    }

    public void Summation()
    {
        int iSum = 0;

        for(int i =0; i<Arr.length;i++)
        {
            iSum = iSum + Arr[i];
        }

        System.out.println("Summation is "+iSum);
    }
}


