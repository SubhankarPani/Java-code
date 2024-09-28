package exampractice;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        int[] arr=new int[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for(int num:arr){
            System.out.print(num);
        }
    }



}
