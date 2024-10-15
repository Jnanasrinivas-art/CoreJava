package Exceptions;

import java.util.Scanner;

public class HandleException
{
    public static void main(String[] args)
    {

        System.out.println("program is started...");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int num =in.nextInt();

        try
        {
            System.out.println(100/num);
        }
        catch (ArithmeticException e)
        {
            System.out.println("pls enter valid entry.");
            System.out.println(e.getMessage());
        }

        System.out.println("program completed...");
        System.out.println("program exit...");
    }
}
