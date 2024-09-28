package exampractice;

import java.util.ArrayList;
import java.util.Arrays;

public class countthecharacter {
    public static void main(String[] args) {
        String str=" the sky is blue";
        String []words=str.split(" ");
       StringBuilder reverse=new StringBuilder();
        for (int i = words.length-1  ;i>=0; i--) {
            reverse.append(words[i]);
            if(i!=0){
                reverse.append(" ");
            }
        }
        System.out.println(reverse.toString());
    }



}
