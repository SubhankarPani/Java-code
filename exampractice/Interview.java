package exampractice;

import java.util.Arrays;

//aaabccdd
public class Interview {
    public static void main(String[] args) {
        String newstr =" ";
        String str="aaabcccdd";
       for(int i=0;i<str.length();i++){
           for(int j=i+1;j<str.length()-1;j++){
               if(str.charAt(i)!=str.charAt(j)){
                   newstr=newstr+str.charAt(i);
               }

           }
       }
    }
}
