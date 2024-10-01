package TCSNQT.striversheet;

import java.util.Arrays;

public class rotateArrayByKelements {
    public static void main(String[] args) {
        int N = 5;
        int array[] = {1, 2, 3, 4, 5};
        int K = 2;
        rotate(array, K);
        System.out.println(Arrays.toString(array));
    }

    public static void rotate(int[] nums, int k) {
        int N = nums.length;
        k = k % N;  // To handle cases where k is greater than N
        reverse(nums, 0, N - 1);      // Reverse the entire array
        reverse(nums, 0, N - k - 1);  // Reverse the first part (N-K elements)
        reverse(nums, N - k, N - 1);  // Reverse the last K elements
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
