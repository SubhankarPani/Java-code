package LeetcodeDailyQuestions;
//Example 1:
//Input: s1 = "ab", s2 = "eidbaooo"
//Output: true
//Explanation: s2 contains one permutation of s1 ("ba").
//Example 2:
//Input: s1 = "ab", s2 = "eidbaooo"
//Output: false
public class PermutationInString {
    public static Boolean checkInclusion(String s1, String s2){
     int l1=s1.length();
     String s1rev="";
        for (int i = s1.length()-1; i >=0; i--) {
            s1rev= String.valueOf(s1.charAt(i));
        }

        for (int i = 0; i <s2.length()-2; i++) {
            if (s2.substring(i, i + 2) == s1 || s2.substring(i, i + 2) == s1rev) {
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        String s1="ab";
        String s2="eidbaooo";
        checkInclusion(s1,s2);
    }
}
