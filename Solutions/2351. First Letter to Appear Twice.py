# https://leetcode.com/problems/first-letter-to-appear-twice/description/

class Solution(object):
    def repeatedCharacter(self, s):
        my_dict = {}   # hash table (dictionary) to track characters we’ve seen

        for char in s:  # loop through every character in the string
            if char in my_dict:  
                return char      # if we've seen this character before → this is the answer
            else:
                my_dict[char] = char  # store this character in dictionary


'''
✅ Step-by-step Explanation:
Initialize dictionary my_dict
This will act like a hash table to store characters we’ve already seen.
Loop through each character in the string (for char in s)
Check if character already exists in dictionary
if char in my_dict:
If yes → that means this is the second time we’ve seen this character, so return it immediately.
If not found yet
Add this character to the dictionary → my_dict[char] = char.
As soon as we find the first repeated character, we return it (loop stops).

✅ Example Walkthrough
Input: s = "abccbaacz"
Start: my_dict = {}
Read 'a' → not in dict → add it → {'a':'a'}
Read 'b' → add → {'a':'a', 'b':'b'}
Read 'c' → add → {'a':'a', 'b':'b', 'c':'c'}
Read 'c' again → already in dict → return 'c' ✅
Answer: 'c'

✅ Complexity
Time Complexity → O(n) (loop once through the string).
Space Complexity → O(1) (since only lowercase English letters → at most 26 entries in dict).
'''
