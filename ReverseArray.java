import java.util.*;

public class ReverseArray 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of array");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter elements of array");

        for(int i = 0; i<Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Elements of array are");

        for(int i = 0; i<Arr.length;i++)
        {
            System.out.print(Arr[i]+"\t");
        }
        System.out.println();

        int iStart = 0;
        int iEnd = Arr.length-1;
        int iTemp = 0;

        while(iStart<iEnd)
        {
            iTemp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = iTemp;

            iStart++;
            iEnd--;
        }

        System.out.println("Reversed elements of array are");
       
        for(int i = 0; i<Arr.length;i++)
        {
            System.out.print(Arr[i]+"\t");
        }


    }    
}
