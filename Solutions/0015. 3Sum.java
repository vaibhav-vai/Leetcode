//https://leetcode.com/problems/3sum/description/



class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output_arr = new LinkedList();

        for(int i=0; i<nums.length-2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int low = i+1;
                int high = nums.length-1;
                int sum = 0-nums[i];

                while(low < high){
                    if(nums[low] + nums[high] == sum){
                        output_arr.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low < high && nums[low] == nums[low+1]) low++;
                        while(low < high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;
                    }
                    else if(nums[low] + nums[high] > sum){
                        high--;
                    }
                    else {
                        low++;
                    }
                }
            }
        }

        return output_arr;
    }
}


/* 
Explanation
The given code represents a solution in Java to the "3Sum" problem, which is as follows:

Given an array `nums` of n integers, find all unique triplets in the array which gives the sum of zero.

The solution sorts the input array `nums` in non-descending order using the `Arrays.sort()` method. It then creates a new `LinkedList` 
object to store the output triplets.

The solution then iterates through the input array `nums` from index 0 to n-3. For each iteration, it checks if the current element is the 
same as the previous element (excluding the first element), to avoid duplicate triplets. If it is not a duplicate, the solution initializes two pointers:
`low` pointing to the next element after the current element, and `high` pointing to the last element of the array.

The solution then finds the sum of the current element, the `low` pointer element, and the `high` pointer element. If the sum is zero, 
the triplet is added to the output list. The solution then moves the `low` pointer to the next distinct element and the `high` pointer to the 
previous distinct element.

If the sum is greater than zero, the solution decrements the `high` pointer to move to a smaller element. If the sum is less than zero, 
the solution increments the `low` pointer to move to a larger element.

The solution returns the output list of triplets.

Overall, the time complexity of the solution is O(n^2), where n is the length of the input array `nums`. This is because the solution iterates 
through the input array `nums` n-2 times, and for each iteration, it uses two nested loops to find pairs of elements that sum up to a specific value, 
resulting in a quadratic time complexity. The space complexity of the solution is also O(n^2) because the output list can contain up to n^2/3 unique triplets,
which is proportional to the input size.
*/
