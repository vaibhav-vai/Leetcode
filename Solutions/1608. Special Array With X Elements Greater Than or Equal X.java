// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/



class Solution {
    public int specialArray(int[] nums) {
        int[] bucket = new int[1001];
        for(int num : nums){
            bucket[num]++;
        }
        int total = nums.length;
        for(int i = 0; i < 1001 ; i++){
            if(i == total){
                return i;
            }
            total -= bucket[i];
        }
        return -1; 
    }
}
