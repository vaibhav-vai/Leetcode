class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for(int i = 0; i < logs.length; i++){
            for (int j = logs[i][0]; j < logs[i][1]; j++){
                arr[j - 1950]++;
            }
        }
        int maxVal = 0;
        int maxYear = 1950;
        for(int i = 0; i < 101; i++){
            if(maxVal < arr[i]){
                maxVal = arr[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }
}
