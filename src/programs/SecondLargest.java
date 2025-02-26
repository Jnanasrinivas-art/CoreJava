package programs;

import java.util.Scanner;

public class SecondLargest
{
    public static void main(String[] args)
    {
        System.out.println("Enter the array size");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=in.nextInt();
        }
         secondLargest(ar);
    }
    public static void secondLargest(int ar[])
    {
        int secondHighest=ar[0];
        int highest=ar[0];

        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]>highest)
            {
                secondHighest=highest;
                highest=ar[i];
            }
            else if (ar[i]>secondHighest)
            {
                secondHighest=ar[i];
            }
        }
        System.out.println("highest "+highest);
        System.out.println("secondhighest"+secondHighest);
    }
}
