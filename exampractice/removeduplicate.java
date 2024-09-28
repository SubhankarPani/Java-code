package exampractice;

import java.util.Arrays;
import java.util.HashSet;

public class removeduplicate {
    public static void main(String[] args) {
        HashSet set=new HashSet();
        int []arr={1,2,3,1,2,3};
        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        System.out.println(set.toString());
    }
}
