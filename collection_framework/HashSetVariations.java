package collection_framework;
import java.net.Inet4Address;
import java.util.*;
import java.util.HashSet;

public class HashSetVariations {
    public static void main(String[] args) {
Example1();
Example2();
Example3();
Checking();
EnhancedLoop();
EnumCLass();


    }
    public static void Example1(){

        HashSet<String> set=new HashSet<>();
        set.add("Geeks");
        set.add("Subhankar");
        set.add("Akriti");
        set.add("set");
        System.out.println(set);
    }
    public static void Example2(){
        HashSet<Integer> a=new HashSet<>();

        a.addAll(Arrays.asList(new Integer[]{1,3,4,2,4,5,3,2}));

        Set<Integer> b=new HashSet<>();
        b.addAll(Arrays.asList(new Integer[]{1,2,4,5,6,7,3,4}));
        Set<Integer>union=new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union of the two Set");
        System.out.println(union);
    }

    public static void Example3(){
        HashSet<Integer> a=new HashSet<>();
        a.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,5,7,4,3}));
        System.out.println(a);
        HashSet<Integer> b=new HashSet<>();
        b.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,8,23,23,435,6,45,23,34,6,7443,98}));

        HashSet<Integer> union=new HashSet<>(a);
        union.addAll(b);
        System.out.println("Union of the two set");
        System.out.println(union);

        HashSet<Integer> intersection=new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Intersection of the two set");
        System.out.println(intersection);

        HashSet<Integer> difference=new HashSet<>(a);
        difference.removeAll(b);
        System.out.println("Difference of the two Set");
        System.out.println(difference);

    }
    public static void Checking(){
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println("Set is " + set);
        String check = "D";
        System.out.println("Contains " + check + " "
                + set.contains(check));
//        if(set.contains("A")){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }

    }
    //enhanced iterative for each loop
    public static void EnhancedLoop() {
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("B");
        set.add("D");
        set.add("E");
        for(String i:set){
            System.out.print(i+",");
        }
        System.out.println();
    }

    //using enum
    public static void EnumCLass(){
        enum Demo{ CODE, LEARN, CONTRIBUTE, QUIZ, MCQ};
        Set<Demo> set1;
        set1=EnumSet.of(Demo.MCQ,Demo.CONTRIBUTE,Demo.CODE);
        System.out.println("set1 : "+set1);
    }
    }

