package TCSNQT.striversheet;

import java.util.Arrays;

public class FindTheLargestElement {
    public static void FindLargestWithMethod(int []arr){
        Arrays.sort(arr);
        System.out.println("The largest element is : "+arr[arr.length-1]);
    }

    public static void FindLargestWithoutMethod(int []arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The largest element is : "+max);
    }
    public static void main(String []args){
        int []arr={2,5,1,3,0};
        FindLargestWithMethod(arr);
        FindLargestWithoutMethod(arr);
    }

}

