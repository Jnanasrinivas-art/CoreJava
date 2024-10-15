package OOPS;

public class InheritanceTypes
{
    public static void main(String[] args) {

        B bobj = new B();
        System.out.println(bobj.a);
        System.out.println(bobj.b);

        bobj.display();
        bobj.show();

        System.out.println("till class B");

        C cobj = new C();
        cobj.c=300;
        System.out.println(cobj.a);
        System.out.println(cobj.b);
        System.out.println(cobj.c);

        System.out.println("----------------------");
        cobj.display();
        cobj.show();
        cobj.print();

    }

}
class A
{
    int a=100;
    void  display()
    {
        System.out.println(a);
    }
}

// single inheritance
class B extends A
{
    int b=200;
    void show()
    {
        System.out.println(b);
    }
}

// multi-level inheritance
class C extends B
{
    int c;

    void print()
    {
        System.out.println(c);
    }
}


