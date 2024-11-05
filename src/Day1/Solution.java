package Day1;

import java.util.Arrays;

public class Solution {

    public int[] runningSum(int[] nums) {

       int[] result =new int[nums.length];
       result[0]=nums[0];
       for(int i=1;i<nums.length;i++){
           result[i]=result[i-1]+nums[i];
       }
       return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        int[] result = solution.runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
}
