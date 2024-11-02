class Leet
{
    public static void main(String arg[])
    {
        Solution sobj = new Solution();

        int Arr[] = {9};

        sobj.plusOne(Arr);
    }
}

class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        int Arr[] = new int[digits.length];
        int iNumber=0;
        int iSum = 0;
        
        for(int i=0;i<digits.length;i++)
        {
            iNumber = ((10*iNumber)+ digits[i]);
        }

        iSum = iNumber +1;
        System.out.println(iSum);
        int iTemp = iSum;
        int iDigit = 0;

        int i = Arr.length-1;
        while((iTemp>0) && (i>=0))
        {
            iDigit = iTemp%10;
            
            Arr[i]=iDigit;
            System.out.println(Arr[i]);

            iTemp = iTemp/10;

            i--;
        }

        return Arr;
    }
}