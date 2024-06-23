package collection_framework;
import java.util.*;
public class ArrayListVariations {
    public static void main(String[] args) {
        System.out.println("ArrayList is " + normal());
        without_return();
        IteratorMethod();
        ShortHand();
        asListMethod();
        ListOfMethod();
        AnotherCollection();
        SimpleLoop();
        ListIteratorMethod();
        WhileLoopMethod();
        streamApiMethod();
    }

    //using return statement
    public static ArrayList<Integer> normal() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        return list;
    }

    public static void without_return() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("ArrayList is " + list);
    }

    //using List iterator
    public static void IteratorMethod() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Iteration method removes brackets ");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    //using shorthand version
    public static void ShortHand() {
        ArrayList<Integer> list = new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
                add(1);
                add(2);
                add(3);
            }
        };
        System.out.println("ArrayList is " + list);
    }
    //iteration using asList

    public static void asListMethod() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 56, 6));
        System.out.println("ArrayList is " + list);
    }

    //using list.of

    public static void ListOfMethod(){
        List<Integer> list=new ArrayList<>(
                List.of(1,2,3,4,5,5)
        );
        System.out.println("ArrayList is "+ list);
    }

    //using arraylist of another collections

    public static void AnotherCollection(){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        List<Integer> list=new ArrayList<>(arr);
        System.out.println("ArrayList is "+list);
    }
//DIFFERENT WAYS TO ITERATE IN AN ARRAYLIST

    public static void SimpleLoop(){
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

//using ListIterator
public static void ListIteratorMethod(){
    ArrayList <String> list= new ArrayList(Arrays.asList( "alex","brian","charles"));
    ListIterator itr = list.listIterator();

    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }
}

//using while loop
public static void WhileLoopMethod(){
    ArrayList <String> list= new ArrayList(Arrays.asList( "alex","brian","charles"));
    int index=0;
    while(list.size()>index){
        System.out.println(list.get(index++));
    }}

    //using StreamAPI

    public static void streamApiMethod(){
            ArrayList <String> list= new ArrayList(Arrays.asList( "alex","brian","charles"));
            list.forEach(i-> System.out.println(i));
    }

}

