package collection_framework.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void countFrequency(int []arr){
        HashMap<Integer,Integer> frequencyMap=new HashMap<>();
        //count the frequency
        for(int num:arr){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }
        //Iterate over the key entries and print
//        for(Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()){
//            System.out.println("Elements"+entry.getKey()+"Freqency"+entry.getValue());
//        }
        System.out.println(frequencyMap);
    }
    public static void main(String[] args) {
        int []arr={1,4,3,5,1,2,3,4,5,1,2,3,4,5};
        countFrequency(arr);
    }
}
