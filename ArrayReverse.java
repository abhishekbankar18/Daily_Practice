import java.util.*;

public class ArrayReverse 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size");
        int iSize=sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter elements of arrray");
        for(int i = 0; i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }

        // for(int j=Arr.length-1;j>=0;j--)
        // {
        //     System.out.println(Arr[j]);
        // }

        for(int i =0; i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }

        int iStart=0;
        int iEnd=Arr.length-1;
        int iTemp = 0;

        while(iStart<=iEnd)
        {
            iTemp=Arr[iStart];
            Arr[iStart]=Arr[iEnd];
            Arr[iEnd]=iTemp;

            iStart++;
            iEnd--;
            iTemp=0;
        }
        System.out.println("Reverse array is");
        for(int i =0; i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }

    }    
}
