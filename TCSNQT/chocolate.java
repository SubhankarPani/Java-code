package TCSNQT;
import  java.util.*;

public class chocolate {
    public static void main(String[] args) {
        int count=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n=sc.nextInt();
        int[] arr=new int [n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                count++;
                arr[i]=arr[i+1];
            }
            else{
                continue;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}