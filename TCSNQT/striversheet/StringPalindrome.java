package TCSNQT.striversheet;

public class StringPalindrome {
    public static void main(String[] args) {
        String str="madam";
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result=result+str.charAt(i);
        }
        if(str.equals(result)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Plindrome");
        }
    }
}
