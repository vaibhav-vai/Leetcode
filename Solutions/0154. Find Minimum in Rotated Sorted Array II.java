//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/



class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        while(start + 1 < end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return Math.min(nums[start], nums[end]);
    }
}
