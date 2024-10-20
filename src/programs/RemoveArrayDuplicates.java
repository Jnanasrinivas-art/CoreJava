package programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveArrayDuplicates
{
    public static void removeArrayDuplicates(int[] ar)
    {
        Set<Integer> s=new HashSet<Integer>();

         for(Integer x:ar)
         {
             s.add(x);
         }
         System.out.println("After removing duplicates"+s);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] ar = new int[n];

        System.out.println("Enter array values");
        for(int i=0;i<n;i++)
        {
           ar[i]=sc.nextInt();
        }
        removeArrayDuplicates(ar);
    }
}
