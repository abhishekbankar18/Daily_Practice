import java.util.*;

public class Summation 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Size of Array");
        int iNo = sobj.nextInt();
        
        int Arr[] = new int[iNo];

        System.out.println("Enter elements of Arr");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of array are ");
        for(int iCnt = 0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt] + "\t");
        }

        int iSum =0;

        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            iSum = iSum+Arr[iCnt];
        }

        System.out.println("Summation is "+iSum);
    }    
}
