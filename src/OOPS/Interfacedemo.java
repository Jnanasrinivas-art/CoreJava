package OOPS;

interface Shape
{
    int length =10;  // final and static
    int width =20; // final and static

    //default methods,static methods implemented,abstract methods are allowed
    void circle();
    default void square()
    {
        System.out.println(" this is square...");
    }
    static void rectangle()
    {
        System.out.println("this is rectangle...");
    }
}

public class Interfacedemo implements Shape
{
    int x=10;
    int y=20;
    //whenever we are trying implement abstract methods in Class, make them public as we do get lower privilege access error
    public void circle()
    {
        System.out.println("this is circle ---abstract method");
    }

    void triangle()
    {
        System.out.println("this is triangle---");
    }
    public static void main(String[] args)
    {
         Interfacedemo idobj=new Interfacedemo();
         idobj.circle();     //abstract
         idobj.square();     //default
         Shape.rectangle();  //static method can directly access from interface
         idobj.triangle();

         Shape sh=new Interfacedemo();
         sh.circle();
         sh.square();
         Shape.rectangle();  //static method can directly access from interface
         //sh.triangle();  //we cannot access

        System.out.println(Shape.length); // we can access static stuff in static methods directly with Class Name or Interface Name
        System.out.println(Shape.width);

       // System.out.println(sh.x);  // we cannot access
       // System.out.println(sh.y);

    }

}
