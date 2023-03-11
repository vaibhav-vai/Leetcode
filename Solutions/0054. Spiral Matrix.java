//https://leetcode.com/problems/spiral-matrix/description/


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        List <Integer> list = new ArrayList <>();

        while(true){
            for(int i = left ; i <= right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            if(top > bottom || left > right){
            break;
            }

            for(int i = top; i <= bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top > bottom || left > right){
            break;
            }

            for(int i = right; i >= left; i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            if(top > bottom || left > right){
            break;
            }

            for(int i = bottom; i >= top; i--){
                list.add(matrix[i][left]);
            }
            left++;
            if(top > bottom || left > right){
            break;
            }
        
        }
        return list;
    }
}
