// https://leetcode.com/problems/move-zeroes/description/



class Solution {
    public void moveZeroes(int[] nums) {
      int insertPosition = 0;

      for(int i = 0; i < nums.length; i++){
        if(nums[i] != 0){
            nums[insertPosition] = nums[i];
            insertPosition++;
        }
      }
      while(insertPosition < nums.length){
          nums[insertPosition++] = 0;
      }  
    }
}

/* Explaination
The given code is a Java solution to move all the zeros in an integer array `nums` to the end while maintaining the relative order of the non-zero elements.

Here's a step-by-step explanation of the code:

1. The method `moveZeroes` takes an integer array `nums` as input and does not return any value (void).

2. The code initializes an integer variable `insertPosition` to 0. This variable will keep track of the position where non-zero elements should be inserted.

3. The code uses a `for` loop to iterate over each element in the `nums` array. The loop variable `i` represents the current index.

4. Inside the loop, the code checks if the current element (`nums[i]`) is not equal to 0, indicating a non-zero element.

5. If the current element is non-zero, the code assigns it to the position `insertPosition` in the array and increments `insertPosition` by one.

6. By doing this, the code effectively overwrites the non-zero elements in the array from left to right, moving them towards the beginning.

7. After iterating over all the elements in `nums`, the non-zero elements are placed at the beginning of the array, and `insertPosition` represents the 
number of non-zero elements encountered.

8. The code then enters a `while` loop that continues as long as `insertPosition` is less than the length of the `nums` array.

9. Inside the `while` loop, the code assigns 0 to the position `insertPosition` in the array and increments `insertPosition` by one. This ensures 
that all the remaining positions from `insertPosition` to the end of the array are filled with zeros.

10. Once the `while` loop finishes, all the non-zero elements have been moved to the beginning of the array, and the zeros are placed at the end 
while maintaining the relative order of the non-zero elements.

11. The method does not return any value since the modifications are made in-place on the input array `nums`.

In summary, the code utilizes a two-pointer approach to move all the zeros to the end of the array while maintaining the relative order of the 
non-zero elements. It uses an `insertPosition` variable to keep track of the position where non-zero elements should be inserted. The time complexity of the 
code is O(n), where n is the length of the input array `nums`, as it requires a single pass through the array. The space complexity is O(1) since the 
modifications are made in-place and no additional data structures are used.
*/
