import java.util.Random;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/98/design/670/
Using Fisher–Yates shuffle Algorithm; Run time: O(n)
 */
public class ShuffleAnArray {


    private int[] nums;
    private Random rand;

    public ShuffleAnArray(int[] nums) {
        this.nums = nums;

        rand = new Random();
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return this.nums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        int[] temp = new int[this.nums.length];
        int randInt;
        System.arraycopy(this.nums, 0, temp, 0, nums.length);
        for (int i = nums.length - 1; i > 0; i--) {
            randInt = rand.nextInt(i + 1);
            swap(temp, i, randInt);
        }
        return temp;
    }

    private void swap(int[] arr, int idx, int randInt) {
        int tmp = arr[idx];
        arr[idx] = arr[randInt];
        arr[randInt] = tmp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
