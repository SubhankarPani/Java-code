package collection_framework;
import java.nio.channels.ScatteringByteChannel;
import java.util.*;
public class HashMapVariations {
    public static void main(String[] args) {
        Example1();
        Example2();
        Example3();


    }

    public static void Example1() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("subhankar", 1);
        map.put("Akriti", 2);
        map.put("Mukesh", 3);
        System.out.println("Size of the map" + map.size());

        System.out.println("key and value both : " + map);

        if (map.containsKey("Akriti")) {
            Integer a = map.get("Akriti");
            System.out.println("value of Akriti : " + a);

        }
    }

    public static void Example2() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        System.out.println("The HashMap is : " + map);

        System.out.println("To get a specific key value : " + (map.get("a")));
        System.out.println("To remove a specific key value");
        Integer bin = map.remove("c");
        System.out.println("After removing the hashmap : " + map);
        System.out.println("Printing the removed value : " + bin);
        System.out.println("Printing size of the HashMap : " + map.size());
        System.out.println(map.entrySet());
        System.out.println(map);

    }

    //traversal in HashMap
    public static void Example3() {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        for (Map.Entry<String, Integer> i : map.entrySet())
            System.out.println("Key:" + i.getKey() + " Value:" + i.getValue());
    }


}
