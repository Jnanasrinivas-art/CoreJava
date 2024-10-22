package programs;

import java.util.Scanner;

public class FactorialOfNumber
{
    public static void factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of number"+" "+fact);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        factorial(n);
    }
}
