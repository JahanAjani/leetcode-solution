import java.util.HashMap;
import java.util.Map;

/*
* https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
*/
public class TwoSum {
    public int[] twoSum_sol1(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j = i+1 ; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }

    public int[] twoSum_sol2(int[] nums, int target) throws Exception {
        Map<Integer, Integer> store = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++){
            Integer index = store.get(target - nums[i]);
            if(index != null){
                return new int[]{index, i};
            }
            store.put(nums[i], i);
        }
        throw new Exception("No such element");
    }
}
