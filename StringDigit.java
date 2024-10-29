import java.util.*;

public class StringDigit
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        int iCnt = 0;

        for(int i = 0; i<Arr.length;i++)
        {
            if((Arr[i]>='0')&&(Arr[i]<='9'))
            {
                iCnt++;
            }
        }

        System.out.println("Digit present in strings are "+iCnt);
    }
}