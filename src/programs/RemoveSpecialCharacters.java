package programs;

import java.util.Scanner;

public class RemoveSpecialCharacters
{
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        removeSpecialCharacters(s);
    }
    public static void removeSpecialCharacters(String s)
    {
        String result=s.replaceAll("[^(a-zA-Z0-9\\s)]","");
        System.out.println("After removal of special characters :"+" "+result);
    }
}
