# https://leetcode.com/problems/max-consecutive-ones/description/

class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # counter = keeps track of current streak of consecutive 1’s
        counter = 0
        
        # max_count = stores the longest streak found so far
        max_count = 0

        # loop through every element in nums
        for i in range(0, len(nums)):

            # if current element is 1, increase streak count
            if nums[i] == 1:
                counter += 1

            # if current element is 0, streak breaks
            else:
                # update max_count with the longer of (previous max, current streak)
                max_count = max(max_count, counter)

                # reset streak counter since we hit a 0
                counter = 0

        # after loop ends, check again in case array ended with 1’s
        max_count = max(max_count, counter)

        # return longest streak found
        return max_count

'''
Example walkthrough:
nums = [1,1,0,1,1,1]
counter → tracks ongoing 1’s
max_count → updates whenever a 0 is hit or at the end
Final result: 3

⏱️ Time Complexity
The loop runs once through the array → O(n)
(where n = length of nums).
💾 Space Complexity
Uses only two extra variables (counter, max_count) → O(1)

So this solution is:
✅ Optimal (best possible time & space).
✅ Easy to understand.
'''
