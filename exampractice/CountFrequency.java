package exampractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountFrequency {
    public static void countFreq(int []arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }

        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    public static void UniqueElement(int []arr){
        HashMap<Integer,Integer> unimap=new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
           if(unimap.containsKey(arr[i])){
               unimap.put(arr[i],unimap.get(arr[i])+1);
           }
           else{
               unimap.put(arr[i],1);
           }
        }
        for(int num:unimap.keySet()){
            if(unimap.get(num)==1){
                System.out.println(num);
            }
        }
        System.out.println(0);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,3,1,2,3,4};
        countFreq(arr);
        UniqueElement(arr);
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if(map.containsKey(arr[i])){
//                map.put(arr[i], map.get(arr[i])+1);
//            }else{
//                map.put(arr[i], 1);
//            }
//        }
//        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
//            System.out.println(entry.getKey()+ " "+ entry.getValue());
//
//        }
    }
    }

