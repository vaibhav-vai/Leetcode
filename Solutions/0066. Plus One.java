//https://leetcode.com/problems/plus-one/description/


class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }

        int[] new_num = new int[n+1];
        new_num[0] = 1;
        return new_num;
        
    }
}
