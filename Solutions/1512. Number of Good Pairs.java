class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pair=0;
        int i=0;
        int j=1;
            for(i=0;i<nums.length-1;i++){
                for(j=1;j<nums.length;j++){
                    if(nums[i]==nums[j] && i<j){
                        pair++;
                    }
                }
            }
        return pair;
    }
}
