package LeetcodeDailyQuestions;

import java.util.Arrays;

public class RangeSumOfSortedSubArraySum {
    public static int SumofSubArray(int arr[], int n, int left, int right) {
        int size = n * (n + 1) / 2;
        int[] subarraySums = new int[size];
        int index = 0;

        // Generate all subarray sums
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                subarraySums[index++] = sum;
            }
        }

        // Sort the subarray sums
        Arrays.sort(subarraySums);

        // Compute the sum for the given range
        long rangeSum = 0;
        int mod = 1000000007;
        for (int i = left - 1; i < right; i++) {
            rangeSum = (rangeSum + subarraySums[i]) % mod;
        }

        return (int) rangeSum;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        int n = 4;
        int left = 1;
        int right = 5;
        int result = SumofSubArray(nums, n, left, right);
        System.out.println(result); // Output should be 13
    }
}
