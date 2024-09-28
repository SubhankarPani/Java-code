package exampractice;

import java.util.ArrayList;
import java.util.Arrays;

public class demo4 {

    public static void UseArraylist(String str){
        ArrayList list=new ArrayList();
        for (int i = 0; i <str.length() ; i++) {
            list.add(str.charAt(i));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        };
    }

    public static void UseArray(String str){
        char[] character=str.toCharArray();
        System.out.print(Arrays.toString(character));
    }

    public static void main(String[] args) {
        String str="My name is subhankar";
        UseArray(str);
    }
}
