package collection_framework.hashsetQuestion;
import java.util.ArrayList;
import java.util.HashSet;

public class CheckDupilcates {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(2);

        HashSet<Integer> set=new HashSet<>(list);
        System.out.println(set);
        System.out.println(list);
        if(set.size()<list.size()){
            System.out.println("Duplicate Present");
        }
        else{
            System.out.println("Duplicate absent");
        }
    }
}
