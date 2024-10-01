package TCSNQT.striversheet;

import java.util.Arrays;

public class KTimesRotateAnArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int k = 2;
        rotate(array,k);
        System.out.println(Arrays.toString(array));
    }

    public static void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
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
