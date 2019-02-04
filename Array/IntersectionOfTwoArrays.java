import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
*/
public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            Integer val = map.get(nums1[i]);
            if (val != null) {
                map.put(nums1[i], val + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            Integer val = map.get(nums2[i]);
            if (val != null) {
                if (val == 1) {
                    result.add(nums2[i]);
                    map.remove(nums2[i]);
                } else {
                    result.add(nums2[i]);
                    map.put(nums2[i], val - 1);
                }
            }

        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++)
            res[i] = result.get(i);
        return res;
    }
}
