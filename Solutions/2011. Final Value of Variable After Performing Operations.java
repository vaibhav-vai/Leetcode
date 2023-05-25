// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/



class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x =0;
        for(int i=0; i < operations.length; i++){
           if(operations[i].charAt(1)=='+'){
               x++;
            } 
        else{
            x--;
        }
        }
        return x;
    }
}

/*Expaination
The given code is a Java solution to calculate the final value after performing a series of operations on a variable `x`. The operations are represented 
as an array of strings `operations`.

Here's a step-by-step explanation of the code:

1. The method `finalValueAfterOperations` takes a string array `operations` as input and returns an integer representing the final value of `x` after 
performing the operations.

2. The code initializes an integer variable `x` to 0. This variable represents the current value of `x` that will be modified based on the operations.

3. The code uses a `for` loop to iterate over each element in the `operations` array. The loop variable `i` represents the current index.

4. Inside the loop, the code checks the second character (`operations[i].charAt(1)`) of the current operation string to determine the type of operation.

5. If the second character is `'+'`, it means the operation is an increment operation. The code increments the value of `x` by 1.

6. If the second character is not `'+'`, it means the operation is a decrement operation. The code decrements the value of `x` by 1.

7. By performing the increment or decrement operation on `x` based on the current element in `operations`, the code updates the value of `x` accordingly.

8. After iterating over all the operations in `operations`, the value of `x` represents the final value after performing all the operations.

9. Finally, the method returns the value of `x`.

In summary, the code iterates over the array of operations and performs the corresponding increment or decrement operation on a variable `x`. 
The final value of `x` represents the result after all the operations are applied. The time complexity of the code is O(n), where n is the length of the 
input array `operations`, as it requires a single pass through the array. The space complexity is O(1) since the variable `x` is the only additional space used, 
regardless of the size of the input.
*/
