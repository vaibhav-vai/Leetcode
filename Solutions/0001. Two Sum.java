//https://leetcode.com/problems/two-sum/description/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for(int i=0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i!=j){
                   if( nums[i] + nums [j] == target){
                       int[] twosum = {i,j};
                       sum = twosum;
                    }
                   
                }
            }
        }
        return sum;
        
    }
}
