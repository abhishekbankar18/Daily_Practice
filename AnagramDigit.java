import java.util.*;

public class AnagramDigit 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number");
        int iNo2 = sobj.nextInt();

        int iTemp1=iNo1;
        int iTemp2=iNo2;

        int iDigit1 = 0;
        int iDigit2 = 0;

        int iFrequency1[] = new int[10];
        int iFrequency2[] = new int[10];

        int iCnt = 0;

        while(iTemp1>0)
        {
            iDigit1 = iTemp1%10;
            iFrequency1[iDigit1]++;
            iTemp1 = iTemp1/10;
        }

        while(iTemp2>0)
        {
            iDigit2 = iTemp2%10;
            iFrequency2[iDigit2]++;
            iTemp2 = iTemp2/10;
        }

        for(int i = 0; i<iFrequency1.length;i++)
        {
            if(iFrequency1[i]==iFrequency2[i])
            {
                iCnt++;
            }
        }

        if(iCnt==10)
        {
            System.out.println("Numbers are anagram");
        }
        else
        {
            System.out.println("Numbers are not anagram");
        }
    }    
}
