package TCSNQT;

import java.sql.SQLOutput;
import java.util.Scanner;
//a number which is equal to its sum of its digits= 153,370
public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int sum=0;
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int temp=n;;
        while(temp!=0){
          int digit=temp%10;
          int squaring=digit*digit*digit;
           sum=sum+squaring;
          temp=temp/10;
        }
        if(n==sum){
            System.out.println("Amstrong number");
        }
        else{
            System.out.println("Not a Amstrong number");
        }
    }
}
