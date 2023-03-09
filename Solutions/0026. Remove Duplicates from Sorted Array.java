//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/



class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(index ==0 || nums[index - 1] != nums[i]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
    
