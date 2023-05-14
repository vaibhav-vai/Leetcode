//https://leetcode.com/problems/3sum-closest/description/



class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++){
            int a_pointer = i+1;
            int b_pointer = nums.length-1;

            while(a_pointer < b_pointer){
                int current_sum = nums[i] + nums[a_pointer] + nums[b_pointer];
                if(current_sum > target){
                    b_pointer -= 1;
                }
                else{
                    a_pointer += 1;
                }

                if(Math.abs(current_sum-target) < Math.abs(result-target)){
                    result = current_sum;
                }
            }
        }
        return result;
    }
}

/*
The given code represents a solution in Java to the "3Sum Closest" problem, which is as follows:

Given an array `nums` of n integers and an integer `target`, find three integers in `nums` such that the sum is closest to `target`. 
Return the sum of the three integers.

The solution first sorts the input array `nums` in non-descending order using the `Arrays.sort()` method. It then initializes a variable `result` 
to the sum of the first three elements of the sorted array.

The solution then iterates through the sorted input array `nums` from index 0 to n-3. For each iteration, it initializes two pointers `a_pointer` and 
`b_pointer`. `a_pointer` points to the element after the current element, and `b_pointer` points to the last element of the array.

The solution then enters a while loop where it calculates the sum of the current element, the `a_pointer` element, and the `b_pointer` element. 
If the sum is greater than the target, the solution decrements the `b_pointer` to move to a smaller element. If the sum is less than or equal to the target,
the solution increments the `a_pointer` to move to a larger element.

The solution then checks if the absolute difference between the current sum and the target is less than the absolute difference between the current `result` 
and the target. If it is, the solution updates the value of `result` to the current sum.

After the while loop, the solution returns the value of `result`.

Overall, the time complexity of the solution is O(n^2), where n is the length of the input array `nums`. This is because the solution iterates through 
the input array `nums` n-2 times, and for each iteration, it uses a two-pointer approach to find the closest sum to the target, resulting in a quadratic 
time complexity. The space complexity of the solution is O(1) because it only uses a few extra variables to store intermediate results and does not use 
any additional data structure proportional to the input size.
*/
