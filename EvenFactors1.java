import java.util.*;

public class EvenFactors1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number");
		int iValue = sobj.nextInt();
		
		Number nobj = new Number(iValue);

		nobj.EvenFactor();

	}
}

class Number
{
	public int iNo;
	
	public Number(int i)
	{
		iNo = i;
	}

	public void EvenFactor()
	{
		for(int i = 2; i<=(iNo/2);i++)
		{
			if(( iNo % i == 0) && (i % 2 == 0))
			{
				System.out.println(i);
			}
		}
	}

}