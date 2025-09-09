# https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Solution(object):
    def removeDuplicates(self, nums):
        index = 1  # position to place the next unique number

        for i in range(1, len(nums)):
            if nums[i] != nums[i-1]:       # found a new unique number
                nums[index] = nums[i]      # put it at the next position
                index += 1                 # move index forward
        
        return index   # new length of array with unique elements


'''
🔹 Step-by-step Explanation

Let’s test with:
nums = [0, 0, 1, 1, 2]

Initialization
index = 1 (the first element is always unique, so we start filling from position 1).

Loop (i = 1 to len(nums)-1):
i = 1
Compare nums[1] (0) with nums[0] (0) → same → skip.
i = 2
Compare nums[2] (1) with nums[1] (0) → different.
→ place nums[2] at nums[index] = nums[1].
Array becomes: [0, 1, 1, 1, 2]
Increment index = 2.
i = 3
Compare nums[3] (1) with nums[2] (1) → same → skip.
i = 4
Compare nums[4] (2) with nums[3] (1) → different.
→ place nums[4] at nums[index] = nums[2].
Array becomes: [0, 1, 2, 1, 2]
Increment index = 3.

End of loop:
index = 3 → means first 3 numbers in array are unique.
Final array:
[0, 1, 2, _, _]
(where _ means irrelevant leftover values).

🔹 Complexity
Time Complexity: O(n) → one pass through the array.
Space Complexity: O(1) → no extra array, in-place modification.

✅ So, the logic is:
Use i to scan array.
Use index to mark where the next unique number should be placed.
Return index as the new length.
'''

