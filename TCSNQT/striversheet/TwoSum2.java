package TCSNQT.striversheet;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int target=9;
        int result[]=new int[2];
        for (int i = 0; i < arr.length; i++) {
            int complement=target-arr[i];
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]==complement){
                   result[0]=arr[i];
                   result[1]=arr[j];
                }
            }

        }
        System.out.println(Arrays.toString(result));

    }
}
