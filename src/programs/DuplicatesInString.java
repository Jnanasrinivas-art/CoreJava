package programs;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicatesInString
{
    public  static void printDuplicatesInString(String s)
    {
        HashMap<Character,Integer> h=new HashMap<Character,Integer>();
        char chArray[] = s.toCharArray();
        for(char x:chArray)
        {
            if(h.containsKey(x))
            {
                h.put(x, h.get(x)+1);
            }
            else
            {
                h.put(x,1);
            }
        }
        System.out.println(h);

        for(char y:h.keySet())
        {
            if(h.get(y)>1)
            {
                System.out.println(y+" - count: "+h.get(y));
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=in.nextLine().toLowerCase();
        printDuplicatesInString(s);
    }
}
