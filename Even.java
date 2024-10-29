import java.util.Scanner;

public class Even 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
       
        System.out.println("Enter number");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.PrintEven(iValue);
    }    
}

class Number
{
    public void PrintEven(int iNo)
    {
        // for(int i = 2; i<=iNo*2; i=i+2)
        // {
        //     System.out.print(i+"\t");
        // }
        int n = 0;
        for(int i = 1;i<=iNo;i++)
        {
            n = n+2;
            System.out.print(n+"\t");
        }
    }
}