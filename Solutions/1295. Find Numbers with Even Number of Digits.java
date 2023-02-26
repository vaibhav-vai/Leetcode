class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for(int i = 0; i < nums.length; i++){

            int j=0;

            while(nums[i] > 0){
                nums[i] = nums[i] / 10;
                j++;
            }

            if(j % 2 == 0){
                even++;
            }
        }
        return even;
    }
}
