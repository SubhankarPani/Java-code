package TCSNQT.striversheet;
//Input: nums = [1,5,4,2,9,9,9], k = 3
//Output: 15
import java.util.HashSet;

public class maximumsubarraysum {
    public static void main(String[] args) {
        int nums[]={1,5,4,2,9,9,9};
        int k=3;
        int i = 0, j = 0;
        long sum = 0;
        long maxSum = 0;
        HashSet<Integer> set = new HashSet<>();

        while (j < nums.length) {
            // Add current element to the sum and set
            while (set.contains(nums[j])) {
                sum -= nums[i];
                set.remove(nums[i]);
                i++;
            }

            sum += nums[j];
            set.add(nums[j]);
            if (j - i + 1 == k) {
                maxSum = Math.max(maxSum, sum); // Update maxSum if distinct

                // Slide the window by removing the leftmost element
                sum -= nums[i]; // Remove the leftmost element from the sum
                set.remove(nums[i]); // Remove the leftmost element from the set
                i++; // Move the left pointer
            }

            // Move the right pointer
            j++;
        }

        System.out.println(maxSum);
    }

}
