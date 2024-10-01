package TCSNQT.striversheet;

import java.util.Arrays;

public class FIndSecondSmallestAndHighest {
    public static void main(String[] args) {
        int []arr={1,2,4,7,7,5};
        Arrays.sort(arr);
        System.out.println(arr[1]);
        System.out.println(arr[arr.length-3]);

    }
}
