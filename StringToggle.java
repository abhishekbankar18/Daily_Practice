import java.util.*;

public class StringToggle
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();
        int iCnt =0;

        for(int i = 0; i<Arr.length;i++)
        {
            if(Arr[i]>='A'&&Arr[i]<='Z')
            {
                Arr[i]= (char)(Arr[i]+32);
            }
            else if(Arr[i]>='a'&&Arr[i]<='z')
            {
                Arr[i] = (char)(Arr[i]-32);
            }
            else if(Arr[i] == ' ')
            {
                iCnt++;
            }
        }

        

        System.out.println(Arr);
        System.out.println(iCnt);
    }
}