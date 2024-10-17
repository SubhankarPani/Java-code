package TCSNQT.striversheet;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int target=9;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int result[]=new int[2];
        for (int i = 0; i < arr.length ; i++) {
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                result[0]=i;
                result[1]=map.get(i);
            }

        }
        System.out.println(Arrays.toString(result));


        }
    }

