// https://leetcode.com/problems/merge-intervals/description/



class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals;
        }
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0],arr2[0]));

        List<int[]> output_arr = new ArrayList();
        int[] current_interval = intervals[0];
        output_arr.add(current_interval);

        for(int[] interval : intervals){
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];

            if(current_end >= next_begin){
                current_interval[1] = Math.max(current_end, next_end);
            }
            else{
                current_interval = interval;
                output_arr.add(current_interval);
            }
        }
        return output_arr.toArray(new int[output_arr.size()][]);
    }
}


/* Explanation
The given code represents a solution in Java to the "Merge Intervals" problem, which is as follows:

Given an array of `intervals` where `intervals[i] = [start_i, end_i]`, merge all overlapping intervals, and return an array of the non-overlapping 
intervals that cover all the intervals in the input.

The solution first checks if the length of the input array `intervals` is less than or equal to 1. If it is, the solution returns the input array, 
since there is no need to merge any intervals in this case.

The solution then sorts the input array `intervals` in non-descending order based on the first element of each interval using a lambda function 
passed as the second argument to the `Arrays.sort()` method.

The solution initializes an ArrayList `output_arr` to store the merged intervals. It also initializes an array `current_interval` to the first 
interval in the sorted `intervals` array and adds it to `output_arr`.

The solution then iterates through the remaining intervals in `intervals` starting from the second interval. For each interval, it extracts the 
beginning and end values of the current interval and the next interval and checks if they overlap. If they do overlap, the solution updates the end 
value of the current interval to be the maximum of the current and next intervals' end values. If they do not overlap, the solution updates 
`current_interval` to be the next interval and adds it to `output_arr`.

After the iteration, the solution returns the contents of `output_arr` as a 2D integer array using the `toArray()` method of `ArrayList`.

The time complexity of the solution is O(nlogn), where n is the length of the input array `intervals`, due to the sorting operation. The space 
complexity of the solution is O(n), where n is the length of the input array `intervals`, because the solution uses an ArrayList to store the merged intervals.
*/
