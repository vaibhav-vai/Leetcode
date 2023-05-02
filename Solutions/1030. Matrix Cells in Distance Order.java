//https://leetcode.com/problems/matrix-cells-in-distance-order/description/



class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans = new int[rows*cols][2];

        for(int i=0; i < rows; i++){
            for(int j=0; j < cols;j++){
                int bno = i * cols + j;
                ans[bno][0] = i;
                ans[bno][1] = j;  
            }
        }

        Arrays.sort(ans,(a,b)->{
            int d1 = Math.abs(a[0]-rCenter) + Math.abs(a[1]-cCenter);
            int d2 = Math.abs(b[0]-rCenter) + Math.abs(b[1]-cCenter);

            return d1-d2;
        });

        return ans;
    }
}
