package String;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> mapS=new HashMap<>();
        Map<Character,Character> mapT=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS=s.charAt(i);
            char charT=t.charAt(i);

            if(mapT.containsKey(charS)){
                if(mapT.get(charS)!=charT){
                    return false;
                }
            }
            else{
                mapT.put(charS,charT);
            }
            if(mapS.containsKey(charT)){
                if(mapS.get(charT)!=charS){
                    return false;
                }
            }
            else{
                mapS.put(charT,charS);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="egg";
        String t="add";
        System.out.println(isIsomorphic(s,t));
    }
}
