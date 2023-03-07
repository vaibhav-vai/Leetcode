//https://leetcode.com/problems/reshape-the-matrix/description/


class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int columns = mat[0].length;

        if(rows * columns != r * c){
            return mat;
        }
        else {
            int[][] output_arr = new int[r][c];
            int col = 0;
            int row = 0;

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    output_arr[row][col] = mat[i][j];
                    col++;

                    if( col == c ){
                        row++;
                        col = 0;
                    }
                }
            }
            return output_arr;
        }
    }
}
