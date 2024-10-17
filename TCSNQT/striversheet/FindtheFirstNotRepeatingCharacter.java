package TCSNQT.striversheet;

import java.util.HashMap;
import java.util.Map;

public class FindtheFirstNotRepeatingCharacter {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else {
                map.put(str.charAt(i),1);
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {

                System.out.println(entry.getKey()+" ----> "+entry.getValue());
            }
        }

    }
}
