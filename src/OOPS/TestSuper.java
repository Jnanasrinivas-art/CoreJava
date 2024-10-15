package OOPS;
class Animal
{
    String color="white";

    void eat()
    {
        System.out.println("eating.......");
    }
}
class Dog extends Animal
{
    String color="black";
    
    void displayColor()
    {
        System.out.println(super.color);
    }

    void eat()
    {
        System.out.println("eating bread......");
        super.eat();
    }
}

public class TestSuper
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.displayColor();
        d.eat();
    }
}
