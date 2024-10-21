package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class NumberOccurences
{
    public static void getNumberCount(int arr[])
    {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for(int x:arr)
        {
            if(hm.containsKey(x))
            {
                hm.put(x,hm.get(x)+1);
            }
            else
            {
                hm.put(x,1);
            }
        }
         System.out.println("The number occurences for each number"+hm);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter 10 digit mobile num:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        getNumberCount(arr);
    }
}
