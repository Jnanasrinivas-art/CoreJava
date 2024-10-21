package programs;

import java.util.Scanner;

public class ReverseANumber
{
    public static void reverseaNumber(int n)
    {
        int rem=0;
        int temp=n;
        int rev=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Number after reverse"+" "+rev);

        /*check whether number is palindrome or not

        if (temp==rev)
        {
            System.out.println("is a palindrome"+" "+rev);
        }
        else
        {
            System.out.println("Not a palindrome"+" "+rev);
        }

        */
    }



    public static void main(String[] args)
    {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        reverseaNumber(n);
    }
}
