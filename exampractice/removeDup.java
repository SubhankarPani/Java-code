package exampractice;

import java.util.HashSet;

public class removeDup {
    public static void main(String[] args) {
        int []arr={1,2,3,1,2,3};
        HashSet set=new HashSet();
        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        System.out.print(set);
    }
}
