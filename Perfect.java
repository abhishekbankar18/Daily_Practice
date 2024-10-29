import java.util.*;

public class Perfect 
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

	System.out.println("Enter number");
	int ivalue = sobj.nextInt();

	Number nobj = new Number();
	
	nobj.IsPerfect(ivalue);
    }    
}

class Number
{
	public void IsPerfect(int iNo)

	{
		int iSum = 0;

		for(int i=1; i<=(iNo/2); i++)
		{
			if(iNo%i==0)
			{
				iSum = iSum+i;
			}
		}
		
		if(iSum==iNo)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Not Perfect number");
		}
	}
}
