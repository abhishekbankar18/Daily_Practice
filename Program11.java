import java.util.*;

public class Program11 
{
    public static void main(String arg[])
    {
        int Arr[] = {10, 20, 30, 40, 50};
        
        System.out.println("Elements of array are");
        for(int i =0; i<Arr.length;i++)
        {
            System.out.print(Arr[i]+"\t");
        }
        System.out.println();
        

        int iStart = 0;
        int iEnd = Arr.length - 1;
        int iTemp = 0;

        while(iStart<iEnd)
        {
            iTemp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = iTemp;

            iStart++;
            iEnd--;
        }

        System.out.println("Reverse Elements of array are");
        for(int i =0; i<Arr.length;i++)
        {
            System.out.print(Arr[i]+"\t");
        }
    }
}
