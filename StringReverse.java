import java.util.Scanner;

public class StringReverse
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string");
        String str = sobj.nextLine();

        Marvellous mobj = new Marvellous();

        mobj.Reverse(str);
    }
}

class Marvellous
{
    public void Reverse(String s)
    {

        char Arr[] = s.toCharArray();

        for(int i= Arr.length-1;i>=0;i--)
        {
            System.out.print(Arr[i]);
        }
        
        System.out.println();
        
        char Brr[] = s.toCharArray();
        char cTemp = '\0';
        int iStart = 0;
        int iEnd = Brr.length-1;

        while(iStart<iEnd)
        {
            cTemp = Brr[iStart];
            Brr[iStart] = Brr[iEnd];
            Brr[iEnd] = cTemp;

            iStart++;
            iEnd--;
        }

        System.out.println(Brr);
    }
}