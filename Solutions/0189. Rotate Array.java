//https://leetcode.com/problems/rotate-array/description/



class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       k %= n;
       reverse(nums, 0, n-k-1);
       reverse(nums, n-k, n-1);
       reverse(nums, 0, n-1);
    }
    public void reverse(int[] nums, int first, int last){
        while(first < last){
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        }
    }

}
