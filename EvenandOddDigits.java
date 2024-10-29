import java.util.Scanner;

public class EvenandOddDigits 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);

        nobj.Digits();
    }    
}

class Number
{
    public int iNo;
    public Number(int i)
    {
        iNo = i;
    }

    void Digits()
    {
        int iDigit = 0;
        int Even = 0;
        int Odd = 0;

        while(iNo > 0)
        {
            iDigit = iNo%10;
            if(iDigit%2==0)
            {
                Even++;
            }
            else
            {
                Odd++;
            }
            iNo = iNo/10;
        }

        System.out.println("Even are "+Even);
        System.out.println("Odd are "+Odd);
    }
}
