# https://leetcode.com/problems/two-sum/description/

class Solution(object):
    def twoSum(self, nums, target):
        for i in range(len(nums)):                # loop 1 (first number)
            for j in range(i+1, len(nums)):       # loop 2 (second number, after i)
                if nums[i] + nums[j] == target:   # check if their sum == target
                    return [i, j]                 # return indices


'''
✅ Step-by-step Explanation
Outer loop (for i in range(len(nums)))
Picks the first number at index i.
Inner loop (for j in range(i+1, len(nums)))
Picks the second number at index j (starts from i+1 so you don’t reuse the same element twice).
Check condition (if nums[i] + nums[j] == target)
If the sum equals the target, return the pair of indices [i, j].
Return immediately when the pair is found.
This works because the problem guarantees exactly one valid answer.

✅ Example Walkthrough
Input:
nums = [2, 7, 11, 15]
target = 9
Outer loop → i=0 → nums[0] = 2
Inner loop → j=1 → nums[1] = 7
Check → 2 + 7 == 9 → ✅ return [0, 1]
Output → [0, 1]

✅ Complexity
Time Complexity: O(n²) (nested loops → every possible pair).
Space Complexity: O(1) (no extra data structure).
'''
