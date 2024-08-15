package Practice;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FirstNotRepeatingCharacter {
    public static void main(String[] args) {
        String str="aabbcdde";
        char[] c= str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char n:c){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }

        }

    }

}
