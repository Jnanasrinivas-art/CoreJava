package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo
{
    public static void main(String[] args)
    {
        //Declaration

        HashSet mySet = new HashSet();
        // Set mySet = new HashSet();
        // HashSet<String> mySet = new HashSet<String>();

        //adding elements into hashset
        mySet.add(100);
        mySet.add(10.5);
        mySet.add("welcome");
        mySet.add(true);
        mySet.add(100);
        mySet.add(null);
        mySet.add(100);
        mySet.add(null);
        mySet.add(200);

        //Printing hashset
        System.out.println(mySet);

        //Size of hashset
        System.out.println(mySet.size());

        //Removing element
        mySet.remove(10.5); // 10.5 is value (not an index)
        System.out.println("After removing: "+mySet);

        //Inserting element - Not possible
        //Access specific element - Not possible,possible workaround through
                                //  converting into arraylist

          //Convert Hashset-->Arraylist
      /*
      ArrayList al = new ArrayList(mySet);
      System.out.println(al);
      System.out.println(al.get(3));
     */

        //Reading all the elements using for each loop
        /*
            for(Object x:mySet)
            {
                System.out.println(x);
            }
        */

        //Using Iterator
        Iterator it = mySet.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //clearing all the elements in hashset
        mySet.clear();
        System.out.println(mySet.isEmpty());

    }
}
