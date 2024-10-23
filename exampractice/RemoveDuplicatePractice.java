package exampractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatePractice {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,3,1,2,3};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        ArrayList<Integer> list=new ArrayList<>(set);
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        System.out.println(sb.toString());
    }
}
