package Exceptions;

import accessspecifier.Test1;

//for protected and default



public class Test2 extends Test1
{
    public static void main(String[] args)
    {

        Test2 t2 = new Test2();
        System.out.println(t2.x);
        t2.m1();

//         Test1 t = new Test1();
//         System.out.println(t.x);
//         t.m1();
    }
}



// for public

//public class Test2
//{
//    public static void main(String[] args)
//    {
//        Test1 t = new Test1();
//        System.out.println(t.a);
//        t.m2();
//    }
//}
