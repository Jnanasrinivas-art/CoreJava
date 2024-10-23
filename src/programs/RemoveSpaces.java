package programs;

import java.util.Scanner;

public class RemoveSpaces
{
    public static void removeSpaces(String s)
    {
        String result=s.replaceAll("\\s+","");
        System.out.println("After white space removal"+" "+result);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        removeSpaces(s);
    }
}
