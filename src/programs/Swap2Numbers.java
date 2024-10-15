package programs;

import java.util.Scanner;

public class Swap2Numbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number");
        int a=in.nextInt();
        System.out.println("Enter second number");
        int b=in.nextInt();
        int temp;

        temp=a;
        a=b;
        b=temp;

        System.out.println("value of a after swapping"+" "+a);
        System.out.println("value of b after swapping"+" "+b);
    }
}
