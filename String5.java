import java.util.*;

public class String5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        System.out.println(str.length());
        System.out.println(Arr.length);

        for(int i = 0; i<Arr.length;i++)
        {
            if(Arr[i]>='A'&&Arr[i]<='Z')
            {
                Arr[i]=(char)(Arr[i]+32);
            }
        }

        System.out.println(str);
        System.out.println(Arr);

        String output = new String(Arr);

        System.out.println(output);
    }
}
