# https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/


class Solution(object):
    def findNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # counter for how many numbers have an even number of digits
        even = 0

        # loop through each number in the input array
        for i in nums:
            # convert number to string and check the length
            # len(str(i)) → number of digits in i
            # if number of digits is even, increase counter
            if len(str(i)) % 2 == 0:
                even += 1
        
        # return total count of numbers with even digits
        return even

'''
✅ Example run
Input: nums = [12, 345, 2, 6, 7896]
12 → len("12") = 2 → even → count=1
345 → len("345") = 3 → odd → count=1
2 → len("2") = 1 → odd → count=1
6 → len("6") = 1 → odd → count=1
7896 → len("7896") = 4 → even → count=2
Return → 2

⏱ Time Complexity:
Loop runs n times (n = len(nums)).
For each number, str(i) takes O(d) where d = number of digits in i.
So total time = O(n * d).
Example: if n=1000 and numbers are up to 1 million (≈6 digits), complexity is still very fast.

💾 Space Complexity:
Only uses one extra variable (even).
So space = O(1).
'''
