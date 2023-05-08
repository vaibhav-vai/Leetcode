// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/



class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int result = (nums[nums.length-1] - 1) * (nums[nums.length-2]-1);
        return result;
    }
}

/* Explaination 
This Java code finds the maximum possible product of any two integers in the input array `nums`. It first sorts the input array in ascending order, 
and then computes the product of the two largest integers in the array minus one.

Here's a line-by-line explanation of the code:
1. `public int maxProduct(int[] nums) {`: This line defines a public method called `maxProduct` that takes an array of integers `nums` as input and returns an integer.

2. `Arrays.sort(nums);`: This line sorts the input array `nums` in ascending order using the `Arrays.sort()` method.

3. `int result = (nums[nums.length-1] - 1) * (nums[nums.length-2]-1);`: This line computes the maximum possible product of any two integers in the sorted 
input array by subtracting one from the two largest integers in the array and multiplying them together. It stores the result in an integer variable called `result`.

4. `return result;`: This line returns the value of the `result` variable as the output of the `maxProduct` method.

Overall, this code uses the `Arrays.sort()` method to sort the input array `nums` in ascending order, and then computes the maximum possible product of any two 
integers in the sorted array by subtracting one from the two largest integers and multiplying them together. The code then returns the maximum product as 
the output of the method.

The time complexity of this code is O(n log n), where n is the length of the input array. The reason for this is that the code uses the `Arrays.sort()` 
method to sort an array of n integers, and the worst-case time complexity of this method is O(n log n).

The space complexity of this code is O(1), because it uses a constant amount of extra space to store the `result` variable.


Space and Time Complexity

The time complexity of this code is O(n log n), where n is the length of the input array. This is because the code calls the `Arrays.sort()` method, 
which has a worst-case time complexity of O(n log n). The code then performs a constant amount of work to compute the product of the two largest elements 
in the sorted array, which takes O(1) time.

The space complexity of this code is O(1), because it uses only a constant amount of extra space to store the `result` variable. 
The `Arrays.sort()` method sorts the input array in place, so it does not require any extra space beyond the input array itself. 
The code does not create any new data structures or arrays that depend on the size of the input array, so the space complexity is constant with 
respect to the size of the input array.
