import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/576/
 */
public class HouseRobber {
    public int robUsingMapAsMemory(int[] nums) {

        Map<Integer, Integer> store = new HashMap<>();

        return findMaxLoot(store, nums, 0);

    }

    private int findMaxLoot(Map<Integer, Integer> store, int[] nums, int idx){
        if(nums.length == 0){
            return 0;
        }
        if(idx >= nums.length){
            return 0;
        }
        int skip1,skip2;

        if(!store.containsKey(idx+1)){
            skip1 = findMaxLoot(store, nums, idx+1);
            store.put(idx+1, skip1);
        }else{
            skip1 = store.get(idx+1);
        }

        if(!store.containsKey(idx+2)){
            skip2 = findMaxLoot(store, nums, idx+2);
            store.put(idx+2, skip2);
        }else{
            skip2 = store.get(idx+2);
        }

        return Math.max(nums[idx]+ skip2 , skip1);
    }
}
