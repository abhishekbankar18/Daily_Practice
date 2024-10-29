import java.util.*;

public class Leader 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of array");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        for(int i =0; i<iSize;i++)
        {
            Arr[i] = sobj.nextInt();
        }

        Number nobj = new Number();
        
        nobj.LeaderX(Arr, iSize);
    }    
}

class Number
{
    void LeaderX(int Brr[], int n)
    {
        int iMax = 0;

        ArrayList<Integer> li = new ArrayList<>(); 

        for(int i=0; i<Brr.length;i++)
        {
            iMax = Brr[i];

            for(int j=i+1; j<Brr.length;j++)
            {
                if(Brr[j]>iMax)
                {
                    iMax = Brr[j];
                }
            }

            if(Brr[i]==iMax)
            {
                li.add(Brr[i]);
            }

            iMax=0;

        }

        int Crr[] = new int[li.size()];

        for(int k =0; k<li.size();k++)
        {
            Crr[k]=li.get(k);
        }    

        System.out.println("Answer is as follows ");

        for(int i=0;i<Crr.length;i++)
        {
            System.out.print(Crr[i]+"\t");
        }

    }
}
