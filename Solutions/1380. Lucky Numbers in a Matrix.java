//https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/


class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < matrix.length; i++){
            int minIndex = 0;
            int min = Integer.MAX_VALUE;
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            boolean lucky = true;
            for(int j = 0; j < matrix.length; j++){
                if(matrix[i][minIndex] < matrix[j][minIndex]){
                    lucky = false;
                    break;
                }
            }
            if(lucky){
                arr.add(matrix[i][minIndex]);
            }
        }
        return arr;
        
    }
}
