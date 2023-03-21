//https://leetcode.com/problems/house-robber/description/



class Solution {
    public int rob(int[] nums) {
        int prev = 0, cur = 0, ans = 0;
        for (int i = 0; i < nums.length; ++i) {
          ans = Math.max(cur, prev + nums[i]);
          prev = cur;
          cur = ans;
        }
        return ans;
    }
}
