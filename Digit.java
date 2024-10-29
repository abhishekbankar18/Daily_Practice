
public class Digit 
{
    public static void main(String arg[])
    {
        int Arr[] = {10,222,987,2,2232};

        for(int i =0; i<Arr.length;i++)
        {
            int iCnt = 0;
            int iNo = Arr[i];

            while(iNo>0)
            {
                iCnt++;
                iNo = iNo/10;
            }

            if(iCnt==3)
            {
                System.out.println(Arr[i]);
            }
        }
    }    
}
