// https://leetcode.com/problems/spiral-matrix-ii/description/


class Solution {
    public int[][] generateMatrix(int n) {
        int [][] matrix = new int[n][n];
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int val = 1 ;

        while(true){
           for(int i = left; i <= right; i++){
               matrix[top][i] = val;
               val++;
            }
            top++;
            if(top > bottom || right < left){
                break;
            }
            for(int i = top; i <= bottom; i++){
                matrix[i][right] = val;
                val++;
            }
            right--;
            if(top > bottom || right < left){
                break;
            }
            for(int i = right; i >= left; i--){
                matrix[bottom][i] = val;
                val++;
            }
            bottom--;
            if(top > bottom || right < left){
                break;
            }
            for(int i = bottom; i >= top; i--){
                matrix[i][left] = val;
                val++;
            }
            left++;
            if(top > bottom || right < left){
                break;
            }
        }
        return matrix;
    }
}
