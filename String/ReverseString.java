package String;

public class ReverseString {

    public static String reverseWords(String s) {
        s=s.trim();
        String []words=s.split("\\s+");
        //int length=words.length;
        StringBuilder reversedString=new StringBuilder();
        for (int i = words.length-1; i >=0 ; i--) {
            reversedString.append(words[i]);
            if(i!=0){
                reversedString.append(" ");
            }
        }

        return reversedString.toString();
    }
    public static void main(String[] args) {
        String s=" My name is Subhankar Pani  ";
        System.out.println(reverseWords(s));
    }
}
