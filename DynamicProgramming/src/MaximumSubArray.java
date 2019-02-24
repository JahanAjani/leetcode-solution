/*
https://leetcode.com/explore/featured/card/top-interview-questions-easy/97/dynamic-programming/566/
 */
public class MaximumSubArray {
    /**
     * solution using Kadane's algorithm
     *
     * @param nums
     * @return maximum sum
     */
    public int maxSubArray(int[] nums) {

        int sum = 0, ans = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
}
