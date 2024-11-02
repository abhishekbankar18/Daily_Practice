import java.util.Scanner;

public class Pattern12
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string");
        String s=sobj.nextLine();

        PatternX pobj = new PatternX();

        pobj.pattern(s);

    }    
}

class PatternX
{
    public void pattern(String str)
    {

        char Arr[] = str.toCharArray();

        for(int i = 0; i<Arr.length;i++)
        {
            for(int j =0; j<Arr.length;j++)
            {
                System.out.print(Arr[j]+"\t");   
            }
            System.out.println();
        }
    }
}