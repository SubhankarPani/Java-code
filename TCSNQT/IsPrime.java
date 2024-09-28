package TCSNQT;
import java.util.*;
public class IsPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        for (int i = 0; i < 10; i++) {
           if(n%2==0){
               count++;
           }
        }
        if(count>1){
            System.out.println("prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
