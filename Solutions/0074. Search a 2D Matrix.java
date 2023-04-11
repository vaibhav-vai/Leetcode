// https://leetcode.com/problems/search-a-2d-matrix/description/



class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int row = matrix.length;
        int col = matrix[0].length;
        int l = 0;
        int r = row * col - 1;

        while(l <=r ){
            int mid = l + (r-l)/2;
            int val = matrix[mid/col][mid%col];
            if(val == target) return true;
            if(val > target){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }

        return false;
    }
}
