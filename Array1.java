import java.util.*;

public class Array1 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of array ");
        int iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);

        aobj.Accept();

        aobj.Display();
    }
}

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {

        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;

        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        for(int iCnt= 0;iCnt<Arr.length;iCnt++)
        {
            System.out.print(Arr[iCnt] + "\t");
        }
    }
}
