// https://leetcode.com/problems/squares-of-a-sorted-array/description/



class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        insertion(nums);
        return nums;
    }
    
    static void insertion(int[] nums){
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j> 0; j--){
                if(nums[j] < nums[j-1]){
                    swap(nums,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
