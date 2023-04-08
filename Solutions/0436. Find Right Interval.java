//https://leetcode.com/problems/find-right-interval/description/


class Solution {
    public int[] findRightInterval(int[][] intervals) {
         int len = intervals.length;
        int[] array = new int[len];
        Map<Integer, Integer> map = new HashMap<> ();
        int[] ans = new int[len];
        
        // Exact the begin time and index of all the intervals
        for(int i = 0; i < intervals.length; i++) {
            array[i] = intervals[i][0];
            map.put(intervals[i][0], i);
        }
        Arrays.sort(array);
        
        // Do binary search in the sorted array of begin time for each interval
        for(int i = 0; i < intervals.length; i++) {
            int target = intervals[i][1];
            int begin = 0, end = len - 1, mid, ret = -1;
            
            while(begin <= end) {
                mid = begin + (end - begin) / 2;
                if(array[mid] == target) {
                    ret = mid;
                    break;
                } else if(array[mid] > target) {
                    ret = mid; // Save the last index of the interval whose begin time is larger than target
                    end = mid - 1;
                } else { // array[mid] < target
                    begin = mid + 1;
                }
            }
            if(ret != -1) {
                ans[i] = map.get(array[ret]);
            } else {
                ans[i] = -1;
            }
        }
        
        return ans;
    }
}
