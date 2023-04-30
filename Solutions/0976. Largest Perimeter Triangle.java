//https://leetcode.com/problems/largest-perimeter-triangle/description/



class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length - 1; i > 1; i--){
            int l3 = nums[i];
            int l2 = nums[i-1];
            int l1 = nums[i-2];

            if(l3 < l2 + l1){
                return l1+l2+l3;
            }
        }
        return 0;
    }
}
