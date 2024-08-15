package ArrayListQuestions;
import access.A;

import java.util.ArrayList;
public class AddRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // remove by index
        list.remove(1);
        System.out.println(list);
        //remove by value
        list.remove(Integer.valueOf(40));
        System.out.println(list);

        ArrayList<String> list2=new ArrayList<>();
        list2.add("apple");
        list2.add("banana");
        list2.add("cherry");
        list2.add("apple");
        System.out.println(list2);
//remove by index
        list2.remove(0);
        System.out.println(list2);
        //remove by value
      list2.remove("cherry");
        System.out.println(list2);

    }
}
