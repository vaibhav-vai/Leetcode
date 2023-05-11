// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/



class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int idx= Math.abs(nums[i])-1;
            if(nums[idx] < 0)
                continue;
            
            nums[idx] *= -1;
        }

        for( int i=0; i<nums.length; i++){
            if(nums[i] > 0)
            result.add(i+1);
        }
        return result;
    }
}




/* Explanation
This Java code provides a solution to the problem of finding all the numbers that are missing from an array of integers from 1 to n. 
The approach used in the code is to mark the numbers present in the array by negating their values, and then finding the indices of the 
positive numbers in the array, which correspond to the missing numbers.

Here's a line-by-line explanation of the code:
```
public List<Integer> findDisappearedNumbers(int[] nums) {
```
This method takes an integer array `nums` as input and returns a list of integers.

```
List<Integer> result = new ArrayList<>();
```
An empty ArrayList is initialized to store the missing numbers.

```
for(int i=0; i<nums.length; i++){
    int idx= Math.abs(nums[i])-1;
    if(nums[idx] < 0)
        continue;

    nums[idx] *= -1;
}
```
This loop iterates over the elements in the input array `nums`. For each element, it calculates the index of the corresponding number 
in the array by taking its absolute value and subtracting 1 (since the numbers in the array are from 1 to n). If the number at the calculated 
index is already negative, it means the number has already been marked as present and we can move to the next element. Otherwise, 
we mark the number as present by negating its value.

The idea behind negating the value is that if the number is present in the array, then its corresponding index will be visited again 
during the iteration. When we encounter the index again, we will know that the number is present because its value will be negative.

```
for( int i=0; i<nums.length; i++){
    if(nums[i] > 0)
    result.add(i+1);
}
```
This loop iterates over the input array again and checks for positive values. If the value at an index is positive, 
it means that the number corresponding to that index is missing from the array. We add the missing number to the result list by adding 1 to 
the index (since the numbers in the array are from 1 to n).

Finally, we return the list of missing numbers.

Overall, this solution has a time complexity of O(n) and a space complexity of O(1) (excluding the space used by the result list).
*/
