/**
 * Problem statement: https://leetcode.com/problems/remove-element/
 * remove duplicates in-place and return the length of array with modification in input array.
 * e.g: nums:[3,2,2,3] val:3; nums:[2], val:4;
 */
public class RemoveRepeatedElement {
    public int removeElement(int[] nums, int val) {

        if (nums.length == 0) {
            return 0;
        }
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                if (j == -1) {
                    j = i;
                }
            } else if (j != -1) {
                nums[j] = nums[i];
                j++;
            }
        }
        if (j == -1) {
            return nums.length;
        }

        return j;
    }
}
