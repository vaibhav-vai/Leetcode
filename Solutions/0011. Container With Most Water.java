// https://leetcode.com/problems/container-with-most-water/description/



class Solution {
    public int maxArea(int[] height) {
        int max_area = 0;
        int a_pointer = 0;
        int b_pointer = height.length-1;

        while(a_pointer < b_pointer){
            if(height[a_pointer] < height[b_pointer]){
                max_area = Math.max(max_area, height[a_pointer] * (b_pointer - a_pointer));
                a_pointer++;
            }
            else{
                 max_area = Math.max(max_area, height[b_pointer] * (b_pointer - a_pointer));
                 b_pointer--;
            }
        }
        return max_area;
    }
}

/*
Explaination
The given code is a Java solution to find the maximum area of water that can be trapped between vertical lines represented by an integer array `height`.

Here's a step-by-step explanation of the code:

1. The method `maxArea` takes an integer array `height` as input and returns an integer representing the maximum area of water.

2. Three variables are initialized:
   - `max_area` is set to 0 to store the maximum area found so far.
   - `a_pointer` is set to the leftmost index of the `height` array.
   - `b_pointer` is set to the rightmost index of the `height` array.

3. The code enters a `while` loop that continues until `a_pointer` is less than `b_pointer`. This means that the two pointers haven't crossed each other yet.

4. Inside the `while` loop, the code checks if the height at the `a_pointer` index is less than the height at the `b_pointer` index.

5. If the height at `a_pointer` is less than the height at `b_pointer`, it means that the limiting factor for the area is the height at `a_pointer`. 
The code calculates the area by multiplying the height at `a_pointer` by the distance between `b_pointer` and `a_pointer` (i.e., `(b_pointer - a_pointer)`). 
It then updates `max_area` to the maximum between the current `max_area` and the calculated area.

6. After calculating the area, the `a_pointer` is incremented by one, moving it towards the right.

7. If the height at `a_pointer` is not less than the height at `b_pointer`, it means that the limiting factor for the area is the height at `b_pointer`. 
The code calculates the area by multiplying the height at `b_pointer` by the distance between `b_pointer` and `a_pointer`. It updates `max_area` to the 
maximum between the current `max_area` and the calculated area.

8. After calculating the area, the `b_pointer` is decremented by one, moving it towards the left.

9. The `while` loop continues until `a_pointer` becomes greater than or equal to `b_pointer`, indicating that all possible combinations have been evaluated.

10. Finally, the method returns the maximum area of water found, stored in the `max_area` variable.

In summary, the code utilizes the two-pointer approach to find the maximum area of water between vertical lines. It starts with the widest possible 
container (using the leftmost and rightmost lines) and then progressively narrows down the container by moving the pointers based on the height of the lines. 
The time complexity of the code is O(n), where n is the length of the input array `height`, as it requires a single pass through the array. 
The space complexity is O(1) since the variables used are constant regardless of the input size.
*/
