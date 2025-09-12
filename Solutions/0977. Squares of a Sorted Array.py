# https://leetcode.com/problems/squares-of-a-sorted-array/description/

class Solution(object):
    def sortedSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        # result array to store squares (will be in descending order first)
        res = []

        # two pointers: left at start, right at end
        l = 0
        r = len(nums) - 1

        # loop until left and right pointers cross
        while l <= r:

            # compare square of left and right values
            if nums[l] * nums[l] > nums[r] * nums[r]:
                # if left square is bigger → put it in result
                res.append(nums[l] * nums[l])
                l += 1  # move left pointer
            else:
                # if right square is bigger (or equal) → put it in result
                res.append(nums[r] * nums[r])
                r -= 1  # move right pointer

        # res has the largest squares first (descending order),
        # so reverse it to make it ascending
        return res[::-1]


'''
🔎 Example
Input: nums = [-4, -1, 0, 3, 10]
Step 1: compare 16 vs 100 → add 100
Step 2: compare 16 vs 9 → add 16
Step 3: compare 1 vs 9 → add 9
Step 4: compare 1 vs 0 → add 1
Step 5: compare 0 vs 0 → add 0
res = [100,16,9,1,0] → reverse → [0,1,9,16,100] ✅

⏱ Time Complexity
We iterate through the array once with two pointers.
Each element is compared and added exactly once.
Reversing the array is also O(n).
Total = O(n)

💾 Space Complexity
We use an extra list res of size n.
So space = O(n)
'''
