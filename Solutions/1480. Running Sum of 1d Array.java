//https://leetcode.com/problems/running-sum-of-1d-array/description/
class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for(int i=1; i<nums.length; i++){
            result[i] = nums[i] + result[i-1];
        }

        return result;
      
      /* 
        for(int i=1; i<nums.length; i++){
          nums[i] = nums[i] + nums [i-1];
        }
        return result;
        */
    }
}
