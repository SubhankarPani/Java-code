package TCSNQT;
//[0,1,1,2,3,5,8]
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range : ");
        int n=sc.nextInt();
        int fact=n;
        for (int i = 1; i < n; i++) {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
