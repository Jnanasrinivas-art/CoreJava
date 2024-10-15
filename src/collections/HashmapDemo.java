package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapDemo
{
    public static void main(String[] args)
    {
        //declaration
        //HashMap hm = new HashMap();
        //Map hm = new HashMap();

        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        //Adding pairs
        hm.put(101,"John");
        hm.put(102,"Scott");
        hm.put(103,"Marry");
        hm.put(104,"Scott");
        hm.put(105,"David");

        //print map
        System.out.println(hm); // [101, 102, 104, 105] list type

        System.out.println("Size of hashmap:"+" "+hm.size());

        //remove pair
        hm.remove(103);   //103 is key of the pair
        System.out.println("After removing pair:"+hm);

        //access value of key
        System.out.println(hm.get(102));

        //get all keys from Hashmap
        System.out.println(hm.keySet());  //[101, 102, 104, 105]

        //get all values from Hashmap
        System.out.println(hm.values());  //[John, Scott, Scott, David]

        //get all key and values from Hashmap
        System.out.println(hm.entrySet());  //[101=John, 102=Scott, 104=Scott, 105=David]

        //Reading from Hashmap

        //Using for..each loop
        for(int k: hm.keySet())
        {
           System.out.println(k+"   "+hm.get(k));
        }

        System.out.println("----------------------------------------");
        //using iterator
        Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();

        while(it.hasNext())
        {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        //clear from Hashmap
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}
