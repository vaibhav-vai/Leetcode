//https://leetcode.com/problems/valid-perfect-square/description/



class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num/2;
        if(num < 2){
            return true;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if((long)mid * mid > num){
                end = mid - 1; 
            }
            else if((long)mid * mid == num){
                return true;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
    }
}
