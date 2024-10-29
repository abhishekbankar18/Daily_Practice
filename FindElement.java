import java.util.*;

public class FindElement {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of array");
        int iValue = sobj.nextInt();

        int Arr[] = new int[iValue];

        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter element that you awnt to search");
        int iSearch = sobj.nextInt();

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == iSearch) {
                System.out.println(i);
            }
        }
    }
}