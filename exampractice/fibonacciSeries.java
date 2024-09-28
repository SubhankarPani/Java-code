package exampractice;
import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of terms to print : " );
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int nextTerm;
        for (int i = 0; i <=n; i++) {
           nextTerm=a+b;
            a=b;
           b=nextTerm;

            System.out.println(nextTerm);
        }
        }
    }



