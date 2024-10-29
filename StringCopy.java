import java.util.*;

public class StringCopy 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        char Brr[] = new char[Arr.length];

        int i = 0;
        while(i < Arr.length)
        {
            Brr[i] = Arr[i];
            i++;
        }

        String output = new String(Brr);


        System.out.println("Copied string is ");
        System.out.println(Brr);
        System.out.println(output);


        int j =0;
        while(j < Arr.length)
        {
            if(Arr[j]>='A'&&Arr[j]<='Z')
            {
                Brr[j] = (char)(Arr[j]+32);
            }
            else if(Arr[j]>='a'&&Arr[j]<='z')
            {
                Brr[j] = (char)(Arr[j]-32);
            }
            else
            {
                Brr[j] = Arr[j];
            }
            j++;
        }

        System.out.println("Toggled string ");

        System.out.println(Brr);
    }    
}
