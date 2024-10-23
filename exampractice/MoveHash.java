package exampractice;

public class MoveHash {
    public static void main(String[] args) {
        String str = "Move#Hash#to#Front";
        int count = 0;
        String updated = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                ;
                updated = updated + str.charAt(i);
            }

        }
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) != '#') {
                updated = updated + str.charAt(j);
            }
        }
        System.out.println(updated);
    }
}
