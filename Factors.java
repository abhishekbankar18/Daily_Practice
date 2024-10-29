import java.util.Scanner;

public class Factors
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.Factor(iValue);
    }
}

class Number
{
    public void Factor(int iNo)
    {
        for(int i = 1; i<=(iNo/2); i++)
        {
            if(iNo%i==0)
            {
                System.out.println(i);
            }
        }
    }
}