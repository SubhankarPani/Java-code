package TCSNQT.striversheet;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatingElements {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,4,5,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }


       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
           if(entry.getValue()>1){
               System.out.println(entry.getKey()+" "+ entry.getValue());
           }
        }
    }
}
