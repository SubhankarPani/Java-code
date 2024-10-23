package exampractice;

import java.util.Arrays;

public class LongestCommonPrefixPractice {
    public static void main(String[] args) {
        String[] str={"flower","flight","flow"};
        Arrays.sort(str);
       // System.out.println(Arrays.toString(str));
       String str1=str[0];
       String str2=str[str.length-1];
       int index=0;
       while(index<str1.length()){
           if(str1.charAt(index)==str2.charAt(index)){
               index++;
           }
           else{
               break;
           }

       }
        if(index==0){
            System.out.println(" ");;
        }
        else{
            System.out.println(str1.substring(0,index));
        }
    }
}
