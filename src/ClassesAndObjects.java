public class ClassesAndObjects
{
    int eid;

    //Declare the variable globally,if the value is constant throughout the class.
    String ename="sai";
    String job;
    int sal;

    public void display()
    {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(sal);
        System.out.println(job);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args)
    {
        //Need to create the objects in the inside, as the execution starts from main method.
       ClassesAndObjects e1 = new ClassesAndObjects();
        e1.eid=10;
        e1.sal=10000;
        e1.job="Senior Software Engineer";
        e1.display();

       ClassesAndObjects e2 = new ClassesAndObjects();
        e2.eid=10;
        e2.sal=20000;
        e2.job="Product Owner";
        e2.display();
    }
}
