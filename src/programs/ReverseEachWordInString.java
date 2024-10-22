package programs;

import java.util.Scanner;

public class ReverseEachWordInString
{
    public static void reverseEachWord(String s)
    {
        String reverse="";
        String stArray[]=s.split(" ");
        for(int i=0;i< stArray.length;i++)
        {
           String word=stArray[i];
           for (int j=word.length()-1;j>=0;j--)
           {
                reverse=reverse+word.charAt(j);
           }
                reverse=reverse+" ";
        }
        System.out.println("Reversed word order"+" "+reverse);

    }

    public static void main(String[] args)
    {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        reverseEachWord(s);
    }
}
