package OOPS;

public class OverloadingvsOverriding
{
    public static void main(String[] args)
    {
        XYZ xyzob = new XYZ();
        xyzob.m1(10);
        xyzob.m2(30);
        xyzob.m2(10,20);
    }
}

class ABC
{
    void m1(int a)
    {
        System.out.println(a);
    }
    void m2(int b)
    {
        System.out.println(b);
    }
}

class XYZ extends ABC
{
    void m1(int a)         //Overriding
    {
        System.out.println(a*a);
    }

    void m2(int b)      //Overrided
    {
        System.out.println(b*b);
    }

    void m2(int a,int b)      //Overloading
    {
        System.out.println(a*b);
    }

}