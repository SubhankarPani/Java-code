package TCSNQT.striversheet;
//Example 1:
//Input: 8 7 1 6 5 9
//Output: 1 5 6 9 8 7
//Explanation: First three elements are in the ascending order and next three elements are in the descending order.
import java.util.Arrays;

public class AscendingDescendingOrder {
    public static void main(String[] args) {
        int []arr={8,7,1,6,5,9};
        Arrays.sort(arr);
        for (int i = 0; i <(arr.length)/2 ; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = arr.length-1; i >= (arr.length)/2 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
