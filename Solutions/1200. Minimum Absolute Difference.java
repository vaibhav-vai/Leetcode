// https://leetcode.com/problems/minimum-absolute-difference/description/



class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList();

        int min_diff = Integer.MAX_VALUE;
        for(int i=1; i < arr.length; i++){
            min_diff = Math.min(arr[i] - arr[i-1], min_diff);
        }

        for(int i=1; i<arr.length; i++){
            if(arr[i] - arr[i-1] == min_diff){
                List<Integer> pair = new ArrayList();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                result.add(pair);
            }
        }
        return result;
    }
}
