//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/



class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> resultSet = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i])-1;

            if(nums[index] < 0){
                resultSet.add(index + 1);
            }
            nums[index] = nums[index] * -1;
        }
        return resultSet;
    }
}

/* Explanation
The given code is a Java solution to find duplicate elements in an integer array `nums` and return them as a list of integers.

Here's a step-by-step explanation of the code:

1. The method `findDuplicates` takes an integer array `nums` as input and returns a list of integers representing the duplicate elements.

2. A new `ArrayList` named `resultSet` is created to store the duplicate elements.

3. The code uses a `for` loop to iterate over each element in the `nums` array. The loop variable `i` represents the current index.

4. Inside the loop, the code calculates the index where the current element should be marked as visited or duplicated. It uses the formula `Math.abs(nums[i])-1`
to get the absolute value of the current element minus one, which corresponds to the index in the array.

5. The code checks if the element at the calculated index (`nums[index]`) is negative. A negative value indicates that the element has been marked as visited 
before, implying that it is a duplicate.

6. If the element at the calculated index is negative, it means that the current element is a duplicate. The code adds `index + 1` to the `resultSet` 
list to store the duplicate element. The `index + 1` is added because the problem assumes the elements in `nums` are in the range 1 to n (inclusive).

7. Regardless of whether the element is a duplicate or not, the code multiplies the element at the calculated index by -1. This marking process ensures 
that if the element is encountered again, it can be identified as a duplicate in the future iterations.

8. After iterating over all the elements in `nums`, the code returns the `resultSet` list containing the duplicate elements.

In summary, the code utilizes a marking technique to identify duplicate elements in the array. It iterates over each element, marks it as visited by 
multiplying it by -1, and checks if the corresponding element has already been marked as visited. If so, it adds the element to the result list. 
The time complexity of the code is O(n), where n is the length of the input array `nums`, as it only requires a single pass through the array. 
The space complexity is O(1) since the result list is the only additional space used, and its size is proportional to the number of duplicates, 
which is at most n-1.
*/
