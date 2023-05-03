// https://leetcode.com/problems/height-checker/description/



class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights,heights.length);
        Arrays.sort(expected);
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(expected[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}
