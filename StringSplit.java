import java.util.*;

public class StringSplit
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string ");
        String str = sobj.nextLine();

        String Arr[] = str.split(" ");

        System.out.println("Number of words are : "+Arr.length);

        for(int i = 0; i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
    }
}