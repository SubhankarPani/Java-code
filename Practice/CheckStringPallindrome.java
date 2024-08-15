package Practice;

public class CheckStringPallindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = true;
        int n = str.length();

        for(int i = 0; i < n ; i++) {
            if(str.charAt(i) != str.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
        }
    }






