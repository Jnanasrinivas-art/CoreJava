package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccurences
{
    public static void getCharCount(String name)
    {
        Map<Character,Integer> charMap = new HashMap<Character,Integer>();
        char strArray[] = name.toCharArray();

        for(char c:strArray)
        {
           if(charMap.containsKey(c))
           {
                 charMap.put(c,charMap.get(c)+1);
           }
           else
           {
               charMap.put(c,1);
           }
        }
        System.out.println(name+":"+charMap);

    }

    public static void main(String[] args)
    {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        getCharCount(s);
    }
}
