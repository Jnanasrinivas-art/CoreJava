package OOPS;

public class MethodOverloading
{
    public static void main(String[] args)
    {
       Adder a1 = new Adder();
       a1.Add(10,20);
       a1.Add(20.1,10);
       a1.Add(10,20.4);
       a1.Add(10,20,30);
    }
}

class Adder
{
    int x;
    double y;
    public void Add(int a,int b)
    {
        int x = a+b;
        System.out.println(x);
    }

    public void Add(int a,int b, int c)
    {
        x=a+b+c;
        System.out.println(x);
    }

    public void Add(int a,double b)
    {
        y = a+b;
        System.out.println(y);
    }

    public void Add(double a,int b)
    {
        y = a+b;
        System.out.println(y);
    }

}

