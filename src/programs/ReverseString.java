package programs;

import java.util.Scanner;

public class ReverseString
{
    public static void reverseString(String s)
    {
        String reverse="";
       String strArray[] =s.split(" ");
       for(int i=strArray.length-1;i>=0;i--)
       {
           reverse=reverse+strArray[i];
           reverse=reverse+" ";
       }
        System.out.println(reverse);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        reverseString(s);
    }
}
