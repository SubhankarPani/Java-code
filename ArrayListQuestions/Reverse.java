package ArrayListQuestions;

import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        ArrayList<Integer> reverse=new ArrayList<>();;
        for(int i=list.size()-1;i>=0;i--){
            reverse.add(list.get(i));
        }

        System.out.println(list);
        System.out.println(reverse);
    }
}
