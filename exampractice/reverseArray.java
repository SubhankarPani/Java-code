package exampractice;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
    int []arr={1,2,3,4,5};
    int []result=new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            //System.out.print(arr[i]+" ");
            result[i]=arr[i];
        }
        System.out.print(Arrays.toString(result));


    }
}
