import java.util.*;

public class Array 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of array ");
        int iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX();

        aobj.Accept(iSize);

        aobj.Display();
    }
}

class ArrayX
{
    public int Arr[];

    public void Accept(int iSize)
    {
        Arr = new int[iSize];

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
