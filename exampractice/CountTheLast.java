package exampractice;

public class CountTheLast {
    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        s=s.trim();
        int length=0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            length++;
            i--;
        }
        System.out.println(length);
    }
}
