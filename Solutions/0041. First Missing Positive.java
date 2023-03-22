// https://leetcode.com/problems/first-missing-positive/description/



class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean contains_one = false;
        for(int x: nums){
            if(x == 1){
                contains_one = true;
                break;
            }
        }
        if(!contains_one){
            return 1;
        } 

        int n = nums.length;
        if(n == 1){
            return 2;
        } 

        for(int i = 0; i < n; ++i){
            if (nums[i] <= 0 || nums[i] > n) nums[i] = 1;
        }

        for(int i = 0; i < n; ++i){
            int x = Math.abs(nums[i]);
            if(nums[x-1] > 0){
                nums[x-1] *= -1;
            }
        }

        for(int i=0; i < n; i++){
            if(nums[i] > 0){
                return i+1;
            }
        }

        return n+1;

        
    }
}
