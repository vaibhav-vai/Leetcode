//https://leetcode.com/problems/set-matrix-zeroes/description/


class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        } 

        for(int i = 0; i < row.size(); i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[row.get(i)][j] = 0;
            }
        }

        for(int i = 0; i < col.size(); i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[j][col.get(i)] = 0;
            }
        }
    }
}
