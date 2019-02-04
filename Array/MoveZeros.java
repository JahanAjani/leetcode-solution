/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
 */
public class MoveZeros {

    public void moveZeroes(int[] nums) {

        int j = -1, i= 0;
        while(j<nums.length && nums.length>1 && i<nums.length-1){
            if(nums[i]==0){

                if(j==-1 && j<nums.length-1){
                    j = i+1;
                }

                while(nums[j]==0 && j<nums.length-1){
                    j += 1;
                }

                nums[i] = nums[j];
                nums[j] = 0;
                i += 1;
                j += 1;

            }else{
                i += 1;
            }
        }
    }
}
