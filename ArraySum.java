import java.util.*;

public class ArraySum 
{
    public static void main(String aeg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENter size");
        int iSize=sobj.nextInt();

        int Arr[] = new int[iSize];

        for(int i =0; i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }

        int iSum = 0;

        for(int i =0; i<Arr.length;i++)
        {
            iSum=iSum+Arr[i];
        }

        System.out.println(iSum);
    }    
}
