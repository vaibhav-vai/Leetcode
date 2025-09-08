# https://leetcode.com/problems/reverse-linked-list/description/

class Solution(object):
    def reverseList(self, head):
        curr = head       # start from the head
        prev = None       # at the beginning, there's no "previous" node

        while curr:       # loop until end of list
            temp = curr.next   # save next node
            curr.next = prev   # reverse pointer
            prev = curr        # move prev forward
            curr = temp        # move curr forward

        return prev            # prev will be the new head

'''
🔹 Step-by-step Walkthrough
Suppose list is:
1 -> 2 -> 3 -> None

Initial:
curr = 1
prev = None

Iteration 1:
temp = 2
curr.next = prev → 1.next = None
prev = 1
curr = 2
List looks like:
1 -> None
2 -> 3 -> None

Iteration 2:
temp = 3
2.next = 1
prev = 2
curr = 3
List:
2 -> 1 -> None
3 -> None

Iteration 3:
temp = None
3.next = 2
prev = 3
curr = None (loop ends)

Final:
3 -> 2 -> 1 -> None

🔹 Complexity
Time Complexity: O(n) → one pass through all nodes
Space Complexity: O(1) → only uses a few pointers (prev, curr, temp)
'''
