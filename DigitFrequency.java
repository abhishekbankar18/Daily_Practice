import java.util.*;

public class DigitFrequency
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number");
        int iValue = sobj.nextInt();

        int iMax = 0;
        int iNo = iValue;
        int iDigit = 0;
        int Frequency[] = new int[10];
        int iDig =0;

        while(iNo>0)
        {
            iDigit = iNo%10;
            Frequency[iDigit]++;
            iNo = iNo/10;
        }

        for(int i = 0; i<Frequency.length;i++)
        {
            if(Frequency[i]>iMax)
            {
                iMax = Frequency[i];
                iDig = i;
            }
        }

        System.out.println("Maximum frequency of digit "+iDig+" is "+iMax);
    }
}