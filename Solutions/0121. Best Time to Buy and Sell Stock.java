// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/



class Solution {
    public int maxProfit(int[] prices) {
        int min_val = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i =0; i<prices.length; i++){
            if(prices[i] < min_val){
                min_val = prices[i];
            }
            else if(prices[i] - min_val > max_profit){
                max_profit = prices[i] - min_val;
            }
        }
        return max_profit;
    }
}

/* Explaination
The given code is a Java solution to find the maximum profit that can be obtained by buying and selling stocks represented by an integer array `prices`.

Here's a step-by-step explanation of the code:

1. The method `maxProfit` takes an integer array `prices` as input and returns an integer representing the maximum profit.

2. Two variables are initialized:
   - `min_val` is set to the maximum value of the `Integer` class (`Integer.MAX_VALUE`). This variable will keep track of the minimum price encountered so far.
   - `max_profit` is set to 0 and will store the maximum profit that can be obtained.

3. The code uses a `for` loop to iterate over each element in the `prices` array. The loop variable `i` represents the current index.

4. Inside the loop, the code checks if the current price at index `i` is less than the current minimum value (`prices[i] < min_val`).

5. If the current price is less than the minimum value, it means it is a potential candidate for the new minimum price. The code updates `min_val` 
to the current price.

6. If the current price minus the minimum value is greater than the current maximum profit (`prices[i] - min_val > max_profit`), it means that selling at 
the current price would result in a higher profit. The code updates `max_profit` to the current price minus the minimum value.

7. By doing this, the code keeps track of the minimum price encountered so far and calculates the maximum profit that can be obtained by selling at the 
current price and buying at the lowest price seen before.

8. After iterating over all the prices, the value of `max_profit` will represent the maximum profit that can be obtained.

9. Finally, the method returns the value of `max_profit`.

In summary, the code utilizes a simple approach to find the maximum profit by keeping track of the minimum price encountered and calculating the profit 
that can be obtained by selling at each price. The time complexity of the code is O(n), where n is the length of the input array `prices`, 
as it requires a single pass through the array. The space complexity is O(1) since the variables used are constant regardless of the input size.
*/
