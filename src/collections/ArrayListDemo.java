package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        // Declaration
        ArrayList myList = new ArrayList();
        // List myList = new ArrayList();

       //Adding data into ArrayList.
        myList.add(10);
        myList.add(21.9);
        myList.add(30);
        myList.add("c");
        myList.add(10);
        myList.add(null);
        myList.add(null);

        //size of arrayList
        System.out.println("size of arraylist" +" "+myList.size());

        //printing arrayList
        System.out.println("printing data from arraylist"+myList);

        //remove element from arraylist  by index
        myList.remove(4);
        System.out.println("printing data from arraylist after remove"+" "+myList);

        //insert the element by index
        myList.add(3,"f");
        System.out.println("After insertion"+" "+myList);

        // modify the element in the arraylist
        myList.set(2,"python");

        System.out.println("After replacing"+" "+myList);

        //Access specific element from Arraylist
        System.out.println(myList.get(2));


        //Reading all the elements from arraylist
        //using normal for loop

        for(int i=0;i<myList.size();i++)
        {
            System.out.println(myList.get(i));
        }

        //using for..each loop
        System.out.println("using for each loop..");

        for(Object x:myList)
        {
            System.out.println(x);
        }

        //using Iterator
        System.out.println("using iterator...");

         Iterator it =myList.iterator();
         while(it.hasNext())
         {
             System.out.println(it.next());
         }

         /*
         eg:
         if we are having homogeneous data in list we define
         Iterator<Integer> it =myList.iterator();

         if we are having heterogeneous data in list we define
         Iterator<Object> it = myList.iterator();
         */

        //checking arraylist is empty or not
        System.out.println("Is arraylist empty?"+ myList.isEmpty());

        //remove multiple randomly elements from arraylist
        ArrayList myList2 = new ArrayList();
        myList2.add(4);
        myList2.add(null);
        myList.removeAll(myList2);
        System.out.println("After removing multiple elements"+myList);

        //remove all elements from arraylist
        myList.clear();
        System.out.println("To clear all elements from list"+" "+myList.isEmpty());

    }
}
