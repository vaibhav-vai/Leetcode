//https://leetcode.com/problems/maximum-subarray/description/


class Solution {
    public int maxSubArray(int[] nums) {
        int maxSumSoFar = nums[0];
        int curMaxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            curMaxSum = Math.max(nums[i], curMaxSum + nums[i]);
            maxSumSoFar = Math.max(curMaxSum, maxSumSoFar);
        }
        return maxSumSoFar;
    }
}
