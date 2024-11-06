package Day1;

import java.util.Arrays;

public class Solution {
    /**
     * Computes the running sum of an input array.
     * <p>
     * Given an integer array `nums`, this method calculates the running sum where each element
     * at index `i` of the result array is the sum of all elements from index `0` to `i` in the input array.
     * </p>
     *
     * @param nums the input integer array for which the running sum is computed.
     * @return an integer array containing the running sum of `nums`.
     */

    public int[] runningSum(int[] nums) {

        // Initialize an array to store the running sums
        int[] result = new int[nums.length];

        // The first element remains the same
        result[0] = nums[0];

        // Iterate through the array starting from the second element, updating each position
        // with the sum of itself and the previous running total.
        for(int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        int[] result = solution.runningSum(nums);
        // Print the result to the console
        System.out.println(Arrays.toString(result));
    }
}
