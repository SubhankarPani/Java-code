package recursion;

public class Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        return checkPalindrome(s, 0, s.length() - 1);
    }

    // Helper recursive function
    static boolean checkPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (!isalnum(s.charAt(left))) {
            return checkPalindrome(s, left + 1, right);
        }
        if (!isalnum(s.charAt(right))) {
            return checkPalindrome(s, left, right - 1);
        }
        if (tolower(s.charAt(left)) != tolower(s.charAt(right))) {
            return false;
        }
        return checkPalindrome(s, left + 1, right - 1);
    }

    // Method to check if a character is alphanumeric
    static boolean isalnum(char ch) {
        return Character.isLetterOrDigit(ch);
    }

    // Method to convert a character to lowercase
    static char tolower(char ch) {
        return Character.toLowerCase(ch);
    }
}
