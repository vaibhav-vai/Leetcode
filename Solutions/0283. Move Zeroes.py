# https://leetcode.com/problems/move-zeroes/description/

class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        l = 0   # Left pointer (points to the position where next non-zero should be placed)

        # Right pointer (r) goes through every element
        for r in range(len(nums)):
            if nums[r]:  
                # If nums[r] is non-zero, swap it with nums[l]
                nums[l], nums[r] = nums[r], nums[l]
                l += 1   # Move left pointer forward since a non-zero has been placed
        
        return nums   # Not required by LeetCode, but useful for testing

'''
🔎 Step-by-step example:
Input: [0,1,0,3,12]
l = 0, r = 0 → nums[0] = 0 → skip
l = 0, r = 1 → nums[1] = 1 → swap nums[0] and nums[1] → [1,0,0,3,12], l = 1
l = 1, r = 2 → nums[2] = 0 → skip
l = 1, r = 3 → nums[3] = 3 → swap nums[1] and nums[3] → [1,3,0,0,12], l = 2
l = 2, r = 4 → nums[4] = 12 → swap nums[2] and nums[4] → [1,3,12,0,0], l = 3
Final result: [1,3,12,0,0] ✅

⏱ Complexity Analysis
Time Complexity:
O(n) → We traverse the list once (r goes from 0 to n-1).
Space Complexity:
O(1) → Only a few variables (l, r), no extra arrays used.
✅ Efficient in-place solution.
'''
