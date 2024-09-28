package exampractice;

public class CountVowels {
    public static void main(String[] args) {
        String str="My name is SubhAnkAr";
        str=str.toLowerCase();
        int count=0;
        char[] character=str.toCharArray();
        for (int i = 0; i < character.length; i++) {
            if(character[i]=='a'|| character[i]=='e'|| character[i]=='i'|| character[i]=='o'|| character[i]=='u'){
                count++;
            }

        }
        System.out.println(count);
    }
}
