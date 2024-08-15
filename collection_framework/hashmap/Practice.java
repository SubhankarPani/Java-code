package collection_framework.hashmap;

import java.util.Hashtable;

public class Practice {
    public static void main(String[] args) {
        Hashtable<String,Integer> hashtable=new Hashtable<>();
        hashtable.put("One",1);
        hashtable.put("Two",2);
        hashtable.put("Three",3);
        // to print the hashmap
        System.out.println("Hashtable Elements : " +hashtable);
        // to print the size of the hashmap
        System.out.println("Size of map is " + hashtable.size());
        // Check if the given key is present and if yes then print the value

        if(hashtable.containsKey("Two")){
            Integer a=hashtable.get("Two");//value gets stored in a
            System.out.println("value of key" + "\" two\" is : "+a);
        }
        // update a key
        hashtable.put("Two",5);
        System.out.println("Updated hashtable"+hashtable);

       // removing the map entry
        hashtable.remove("Two");
        System.out.println("updatedremovedhashtable"+hashtable);
    }
}
