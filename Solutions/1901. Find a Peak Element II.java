// https://leetcode.com/problems/find-a-peak-element-ii/description/



class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int startRow = 0;
        int endRow = mat.length-1;
        while(startRow <= endRow){
            int midRow = startRow + (endRow - startRow)/2;
            int rowMax = maxElementPosition(mat[midRow], mat[midRow].length-1);

            //if midRow is first row
            if(midRow == 0){
                if(mat[midRow][rowMax] > mat[midRow+1][rowMax]){
                    return new int[]{midRow,rowMax};
                }
            }

            //if midRow is last row 
            if(midRow == mat.length-1){
                if(mat[midRow][rowMax] > mat[midRow-1][rowMax]){
                    return new int[]{midRow,rowMax};
                }
            }

            //checking max element of the row with it's upper and lower row
            if(mat[midRow][rowMax] > mat[midRow+1][rowMax] && mat[midRow][rowMax] > mat[midRow-1][rowMax]){
                return new int[]{midRow,rowMax};
            }

            //if max is lesser than next rows same column element, will move startRow to the nextRow
            if(mat[midRow][rowMax] < mat[midRow+1][rowMax]){
                startRow = midRow + 1;
            }
            else{
                endRow = midRow - 1;
            }

        }
        // we didn't find peak element in matrix
	    return new int[]{-1, -1};
    }

    static int maxElementPosition(int[] arr, int end){
        int max = 0;
        for(int i = 0; i <= end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
