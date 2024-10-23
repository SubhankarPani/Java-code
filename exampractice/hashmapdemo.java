package exampractice;

import java.util.HashMap;
import java.util.Map;

public class hashmapdemo {
    public static void main(String[] args) {
        int []num={1,2,3,1,2,3,4,1,2,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            if(map.containsKey(num[i])){
                map.put(num[i],map.get(num[i])+1);
            }
            else{
                map.put(num[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey()+" --->"+ entry.getValue());
                break;
            }
            //System.out.println(entry.getKey()+" --> "+entry.getValue());
        }
    }

}
