package exampractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashSet;

public class demo5 {
    public static void PrintCharacter(String str){
        str=str.trim();
        char []character=str.toCharArray();
        for (int i = 0; i < character.length; i++) {
            System.out.print(character[i]);
            System.out.print(" ");
            }
        }

    public static void PrintCharacterUsingMethod(String str){
        str=str.trim();
        char []character=str.toCharArray();
        System.out.println(" ");
        System.out.print(Arrays.toString(character));
    }
    public static void PrintUsingStringBuilder(String str){
        str=str.trim();
        StringBuilder arr=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            arr.append(str.charAt(i));
        }
        System.out.print(arr.toString());
    }
    public static void ReversePrintCharacter(String str){
        str=str.trim();
        char []character=str.toCharArray();
        for (int i = character.length-1; i >=0; i--) {
            System.out.print(character[i]);
            System.out.print(" ");
        }
    }


    public static void ReversePrintUsingStringBuilder(String str){
        str=str.trim();
        StringBuilder arr=new StringBuilder();
        for (int i = str.length()-1; i >=0; i--) {
            arr.append(str.charAt(i));
        }
        System.out.print(arr.toString());
    }
    public static void ReverseWords(String str){
        str=str.trim();
        String []words=str.split(" ");
        for (int i = words.length-1; i >=0; i--) {
            System.out.print(words[i]);
            if(i!=0){
                System.out.print(" ");
            }
        }
    }
    public static void ReverseWordsUsingStringBuilder(String str){
        str=str.trim();
        String []words=str.split(" ");
        StringBuilder array=new StringBuilder();
        for (int i = words.length-1; i >=0; i--) {
            array.append(words[i]);
        }
        System.out.print(array);
    }

    public static void removeDup(int []num){
        int []arr={1,2,3,1,2,3};
        HashSet set=new HashSet();
        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        System.out.print(set);
    }
    public static void main(String[] args) {
        String str=" My name is Subhankar ";
        int[] num={1,2,3,1,2,3};
        PrintCharacter(str);
        System.out.println();
        PrintCharacterUsingMethod(str);
        System.out.println();
        PrintCharacterUsingMethod(str);
        System.out.println();
        ReversePrintCharacter(str);
        System.out.println();
        ReversePrintUsingStringBuilder(str);
        System.out.println();
        ReverseWords(str);
        System.out.println();
        ReverseWordsUsingStringBuilder(str);
        System.out.println();
        removeDup(num);
    }
}
