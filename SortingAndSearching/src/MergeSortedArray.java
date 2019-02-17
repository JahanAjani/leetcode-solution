/*
https://leetcode.com/explore/featured/card/top-interview-questions-easy/96/sorting-and-searching/587/
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = m + n - 1;
        int k = n - 1;


        while (k >= 0 && i >= 0) {
            if (nums1[i] <= nums2[k]) {
                nums1[j] = nums2[k];
                k--;
                j--;
            } else {
                nums1[j] = nums1[i];
                i--;
                j--;
            }
        }

        if (i < 0) {
            while (j >= 0) {
                nums1[j] = nums2[k];
                k--;
                j--;
            }
        }
    }
}
