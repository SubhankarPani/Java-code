package TCSNQT.striversheet;

import java.util.HashMap;

public class CountFrequency {
    public static void HashMapApproach(int []arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }

        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        HashMapApproach(arr);
    }
}
