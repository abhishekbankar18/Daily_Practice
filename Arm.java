import java.util.*;

public class Arm 
{
    public static void main(String arg[])  
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.ArmStrong(iValue);

    } 
}

class Number
{
    public void ArmStrong(int iNo)
    {
       int dCnt = 0;
       int temp = iNo;
       int temp2 = iNo;
       int iDigit = 0;
       int dPower = 1;
       int Sum = 0;

       while(temp != 0)
       {
          temp = temp / 10;
          dCnt++;
       }

       while(iNo != 0)
       {
           iDigit = iNo % 10;
           
           for(int i = 1; i <= dCnt; i++)
           {
              dPower = dPower * iDigit;
           }

           Sum = Sum + dPower;
           dPower = 1;
           iNo = iNo /10;
       }
       
       if(Sum == temp2)
       {
        System.out.println("Number is Armstrong");
       }
       else
       {
        System.out.println("Number is Not Armstrong");
       }
    }
}
