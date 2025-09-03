# https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        left = 0
        right = 1
        max_profit = 0

        while right < len(prices):
            if prices[right] > prices[left]:
                profit = prices[right] - prices[left]
                max_profit = max(profit, max_profit)
            else:
                left = right
            right += 1 
        return max_profit

'''
✅ How it works
left pointer = day we buy
right pointer = day we sell
If selling price (prices[right]) is greater than buying price (prices[left]):
→ calculate profit, update max profit.
If not profitable (prices[right] <= prices[left]):
→ move left to right (basically, choose a new buy day).
Keep moving right across the array.

✅ Example
Input: [7, 1, 5, 3, 6, 4]
Start: left=0 (7), right=1 (1) → 1 < 7 → move left to 1.
left=1 (1), right=2 (5) → profit=4 → max_profit=4.
right=3 (3) → profit=2 → no update.
right=4 (6) → profit=5 → max_profit=5.
right=5 (4) → profit=3 → no update.
✅ Answer = 5.

✅ Complexity
Time → O(n) (just one pass through prices).
Space → O(1) (only a few variables).
'''
