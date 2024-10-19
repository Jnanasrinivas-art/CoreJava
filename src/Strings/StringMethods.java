package Strings;

public class StringMethods
{
    public static void main(String[] args)
    {
          String s="welcome";
        //String s = new String("welcome");

        //length - returns length of a string(number of characters)
          int l=s.length();
          System.out.println(l);  //7
          System.out.println("welcome".length());  //7

        //concat - joining strings
        String s2="to java";
        String s3="automation";
        System.out.println(s+s2);  //welcometo java
        System.out.println(s.concat(s2));  //welcometo java

        System.out.println(s+s2+s3); //welcometo javaautomation
        System.out.println(s.concat(s2).concat(s3));  //welcometo javaautomation

        //trim() - remove spaces right and left side
        String s4="   welcome   ";
        System.out.println("Before Trimming:"+s4.length());
        System.out.println(s4);  //prints string along with spaces
        System.out.println(s4.trim());
        System.out.println("After Trimming:"+s4.trim().length());

        //charAt() - returns a character from a string based on index
        //index starts from 0
        System.out.println(s.charAt(3));  //c

        //contains() - checks whether a particular string is part of another string,case-sensitive
        // returns true or false

        System.out.println(s.contains("wel"));
        System.out.println(s.contains("come"));
        System.out.println(s.contains("Wel"));

        //equals(), equalsIgnoreCase() - compare strings
        String s6="welcome";

        System.out.println(s==s6);   //true
        System.out.println(s.equals(s6));  //true
        System.out.println(s.equalsIgnoreCase(s6)); //true

        //replace - replace single/multiple(sequence of characters in a string)
        String s7="welcome to selenium java selenium python selenium c#";
        System.out.println(s7.replace('e','x'));  //wxlcomx to sxlxnium java sxlxnium python sxlxnium c#
        System.out.println(s7.replace("selenium","playwright"));  //welcome to playwright java playwright python playwright c#

        //substring() - extract substring from main string


    }
}
