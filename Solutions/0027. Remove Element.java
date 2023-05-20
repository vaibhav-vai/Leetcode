// https://leetcode.com/problems/remove-element/description/



class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length ==0){
            return 0;
        }

        int valid_size = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[valid_size] = nums[i];
                valid_size++;
            }
        }
        return valid_size;
    }
}


/* Explaination
The given code is a Java solution to remove all occurrences of a specific value `val` from an integer array `nums` and return the new length of the modified array.

Here's a step-by-step explanation of the code:

1. The method `removeElement` takes an integer array `nums` and an integer value `val` as input and returns an integer representing the new length of the 
modified array.

2. The code first checks if the input array `nums` is empty (`nums.length == 0`). If it is, it means there are no elements in the array, so the method returns 0.

3. If the array is not empty, an integer variable `valid_size` is initialized to 0. This variable will keep track of the new length of the modified array.

4. The code uses a `for` loop to iterate over each element in the `nums` array. The loop variable `i` represents the current index.

5. Inside the loop, the code checks if the current element at index `i` is not equal to the given value `val`.

6. If the current element is not equal to `val`, it means it should be included in the modified array. The code assigns the current element 
(`nums[i]`) to the position `valid_size` in the array and increments `valid_size` by one.

7. By doing this, the code effectively overwrites the elements that are equal to `val` with the subsequent non-`val` elements, shifting them 
towards the beginning of the array.

8. After iterating over all the elements in `nums`, the `valid_size` variable represents the new length of the modified array.

9. The method returns the value of `valid_size`, indicating the number of elements in the modified array after removing all occurrences of `val`.

In summary, the code performs an in-place removal of all occurrences of the given value `val` from the array `nums`. It maintains a separate pointer 
(`valid_size`) to keep track of the new length of the modified array. The time complexity of the code is O(n), where n is the length of the input array `nums`, 
as it requires a single pass through the array. The space complexity is O(1) since the modifications are made in-place and no additional data structures 
are used.
*/
