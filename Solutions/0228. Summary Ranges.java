// https://leetcode.com/problems/summary-ranges/description/



class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; ++i) {
            final int begin = nums[i];
            while (i + 1 < nums.length && nums[i] == nums[i + 1] - 1)
                ++i;
            final int end = nums[i];
            if (begin == end)
                ans.add("" + begin);
            else
                ans.add("" + begin + "->" + end);
        }

    return ans;
    }
}

/* Explaination
The given code is a Java solution to create a summary of ranges from a sorted integer array `nums`.

Here's a step-by-step explanation of the code:

1. The method `summaryRanges` takes an integer array `nums` as input and returns a list of strings representing the summary of ranges.

2. A new `ArrayList` named `ans` is created to store the summary ranges.

3. The code uses a `for` loop to iterate over each element in the `nums` array. The loop variable `i` represents the current index.

4. Inside the loop, the code sets the variable `begin` to the current element at index `i`.

5. The code then enters a `while` loop, which continues as long as the current element (`nums[i]`) is consecutive to the next element (`nums[i + 1]` 
is one greater than `nums[i]`).

6. In the `while` loop, the code increments `i` by one, effectively skipping all consecutive elements until the sequence of consecutive elements ends.

7. After the `while` loop, the variable `end` is set to the last element encountered in the consecutive sequence.

8. If the `begin` and `end` values are the same, it means that there is only one element in the range. The code adds the string representation of 
`begin` to the `ans` list.

9. If the `begin` and `end` values are different, it means that there is a range of consecutive elements. The code adds the string representation of 
`begin` followed by `"->"` and `end` to the `ans` list.

10. The `for` loop continues until all elements in the `nums` array have been processed.

11. Finally, the method returns the `ans` list, which contains the summary of ranges.

In summary, the code iterates over the sorted array `nums` and identifies consecutive elements to create a summary of ranges. It keeps track of the 
beginning and end of each range and adds the appropriate string representation to the result list. The time complexity of the code is O(n), 
where n is the length of the input array `nums`, as it requires a single pass through the array. The space complexity is also O(n) since the 
size of the output list `ans` can be at most n, depending on the number of ranges in the array.
*/
