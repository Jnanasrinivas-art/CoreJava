package programs;

import java.util.Scanner;

public class Swap2NumbersWithoutThirdVariable
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int a=in.nextInt();
        System.out.println("Enter second number");
        int b=in.nextInt();

        a=a+b; //30
        b=a-b; //30-20=10
        a=a-b; //30-10=20

        System.out.println("value of a after swapping"+" "+a);
        System.out.println("value of b after swapping"+" "+b);
    }
}
