package exampractice;
import java.util.*;
public class demo {

    public static void reverse_sentence(String s) {
        String reversedString = " ";
        for (int i = s.length() - 1; i >=0; i--) {
            reversedString = reversedString + s.charAt(i);
        }
        System.out.println(reversedString);
    }

    public static void reverse_word(String w){
        String reversed="";
        for (int i = w.length()-1; i >=0; i--) {
            reversed=reversed+w.charAt(i);

        }
        System.out.println(reversed);
    }
    public static void reverse_word_in_sentence(String s){
        String []words=s.split(" ");

        StringBuilder reversedSentence=new StringBuilder();
        for (int i = words.length-1; i >=0 ; i--) {
            reversedSentence.append(words[i]);
            if(i!=0){
                reversedSentence.append(" ");
            }
        }
        System.out.println(reversedSentence.toString());
    }
    public static void word_in_sentence(String s){
         s=s.trim();
        String []words=s.split(" ");
        StringBuilder reversedSentence=new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            reversedSentence.append(words[i]);
            if(i!=0){
                reversedSentence.append(" ");
            }
        }
        System.out.println(reversedSentence.toString());
    }
    public static void max(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) { // Compare max with the current array element
                max = arr[i]; // Update max if a larger element is found
            }
        }
        System.out.println("Maximum Element: " + max);
    }

//    public static void remove_duplicate(int arr[]){
//        HashSet set=new HashSet();
//
//    }

    public static void reverse_array(int arr[]){
       int start=0;
       int end=arr.length-1;
       while(start<end){
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse_intarray(int arr[]){
       StringBuilder reversed=new StringBuilder();
        for (int i = arr.length-1; i>=0 ; i--) {
            reversed.append(arr[i]);
            if(i!=0){
                reversed.append("");
            }

        }
        System.out.println(reversed.toString());

    }
    public static void printcharacterofString(String w){
        w=w.trim();
         char[] charcter =w.toCharArray();
        for (int i = 0; i < w.length(); i++) {
            System.out.print(w.charAt(i)+" ");

        }
    }
    public static void printcharacter(String w){
        w=w.trim();
        char[] charcter =w.toCharArray();
        for (int i = 0; i < w.length(); i++) {
            System.out.print(w.charAt(i)+" ");

        }
    }




    public static void main(String[] args) {

        String s = "  Hello  my name is Subhankar  ";
        String w=" Hello World ";
        int[] arr={1,2,3,4,6};
        max(arr);
        int []array =new int [10];
        reverse_word_in_sentence(s);
        reverse_sentence(s);
        reverse_word(w);
        word_in_sentence(s);
        reverse_array(arr);
        reverse_intarray(arr);
        printcharacterofString(w);
        printcharacter(w);
    }
}