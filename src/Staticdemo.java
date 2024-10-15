public class Staticdemo
{
    static int a=10;  //static variable
    int b=20;        //non-static variable

    static void m1()
    {
        System.out.println("this is m1 static method");
    }

    void m2()
    {
        System.out.println("this is m2 non-static method...");
    }

    public static void main(String[] args)
    {
        System.out.println(a);
        m1();
        //System.out.println(sd.b); //cannot access, b is non-static
        //sd.m2();//cannot access, m2 is non-static
        Staticdemo sd = new Staticdemo();
        //System.out.println(sd.b);
        //sd.m2();
        sd.m();
    }

    void m()
    {
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }
}
