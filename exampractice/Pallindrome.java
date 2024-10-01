package exampractice;

public class Pallindrome {
     public static void main(String[]args){
         int n=121;
         int reverse=0;
         while(n!=0){
             int lastdigit=n%10;
             reverse=(reverse*10)+lastdigit;
             n=n/10;
         }
         if(n==reverse){
             System.out.println("Palindrome");
         }
         else {
             System.out.println("Not palindrome");
         }
     }
}
