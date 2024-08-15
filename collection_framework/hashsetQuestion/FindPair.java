package collection_framework.hashsetQuestion;
import java.util.HashSet;

public class FindPair {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 7, 5};
        int target = 9;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int remaining= target-arr[i];
            if(set.contains(remaining)){
                System.out.println("("+arr[i]+","+remaining+")");
            }
            else{
                set.add(arr[i]);
            }
        }
    }
}
