package StringsPractice;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String []str={"apple","ape","april","mango"};
        if(str==null || str.length==0){
            System.out.println(" ");
        }
        Arrays.sort(str);
        String first=str[0];
        String last=str[str.length-1];

        int i=0;
        while(i<first.length() && i<last.length() && first.charAt(i) == last.charAt(i)){
            i++;
        }
        System.out.println(first.substring(0,i));
    }

}
