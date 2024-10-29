import java.util.*;

public class Divisible4 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enetr size of array");
        int iValue = sobj.nextInt();

        int Arr[] = new int[iValue];

        System.out.println("Enter elements ");

        for(int i = 0; i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();

        aobj.Divisible(Arr);
    }
}

class ArrayX
{
    public void Divisible(int Arr[])
    {
        System.out.println("Elements divisible by 5 are");
        for(int i = 0; i<Arr.length;i++)
        {
            if(Arr[i]%5==0)
            {
                System.out.println(Arr[i]);
            }
        }
    }
}
