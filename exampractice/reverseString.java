package exampractice;

public class reverseString {
    public static void main(String[] args) {
        int n=536;
        int reversed=0;

        while (n != 0) {
            int digit=n%10;
            reversed=reversed*10+digit;
            n=n/10;
        }
        System.out.println("The reversed number is : "+reversed);
    }
}
