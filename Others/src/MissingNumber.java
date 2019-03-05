/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/722/
 */
public class MissingNumber {
    public int find(int[] nums) {
        int total = nums.length * (nums.length + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return total - sum;
    }
}
