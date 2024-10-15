package wrapperclasses;

public class DataConversionMethods
{
    public static void main(String[] args)
    {
        //String s="welcome";      //cannot convert to int

        //String--Int
        String s1="10";
        String s2="20";
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

        //String--Double
        String s3="10.5";
        String s4="20.1";
        System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));

        String s6="true";        //other than true if we pass any string that will return false.
        System.out.println(Boolean.parseBoolean(s6));

        int s=10;
        String sv = String.valueOf(s);
        System.out.println(sv);

    }
}
