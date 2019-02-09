import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> dict = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (dict.get(nums[i]) != null)
                return true;
            dict.put(nums[i], 1);
        }
        return false;
    }
}