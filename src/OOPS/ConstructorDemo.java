package OOPS;

public class ConstructorDemo
{
    int x;
    int y;
    ConstructorDemo()
    {
        x=100;
        y=200;
    }

    ConstructorDemo(int a,int b)
    {
        x=a;
        y=b;
    }

    void sum()
    {
        System.out.println(x+y);
    }

    public static void main(String[] args)
    {
        ConstructorDemo cd = new ConstructorDemo();  //default constructor is invoked.
        ConstructorDemo cd1 = new ConstructorDemo(100,200); //parameterized constructor.
        cd.sum();
        cd1.sum();
    }

}
