//https://leetcode.com/problems/sqrtx/description/



class Solution {
    public int mySqrt(int x) {

        if (x < 2) {
        return x;
        }

        int end = x / 2;
        
        int start = 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if ((long)mid*mid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
