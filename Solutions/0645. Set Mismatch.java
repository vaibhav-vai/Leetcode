// https://leetcode.com/problems/set-mismatch/description/



class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int [2];
        
        for(int i: nums){
            if(nums[Math.abs(i)-1] < 0){
                result[0] = Math.abs(i);
            }
            else{
                nums[Math.abs(i)-1] *=-1;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                result[1] = i+1;
            }
        }

        return result;
    }
}


/* Explanation


The given code represents a solution in Java to the "Set Mismatch" problem, which is as follows:

You have an array of integers containing n distinct elements ranging from 1 to n. One of the elements is missing in the array, and another element occurs twice. 
Find these two elements.

The solution uses the fact that the elements in the array are in the range of 1 to n. It makes use of the property that if an element is encountered twice, 
its corresponding index will be encountered twice too.

The solution scans through the input array `nums` twice. In the first loop, it iterates through each element of the array and marks the element's 
corresponding index as negative if it has not been marked already. If it has been marked negative already, it means that it is a repeated element, 
and it is stored in the first position of the result array `result[0]`. 

In the second loop, it iterates through the array again and finds the index that is not marked negative. This means that the corresponding element is missing, 
and it is stored in the second position of the result array `result[1]`.

Finally, the result array `result` is returned.

The time complexity of the given solution is O(n), where n is the length of the input array `nums`. This is because the solution scans through the input array 
`nums` twice, and the time taken by each scan is proportional to the length of the array `nums`.

In the first loop, the solution iterates through each element of the array, and for each element, it performs a constant number of operations (i.e., 
accessing an array element, taking its absolute value, and negating the value if necessary). Therefore, the time complexity of the first loop is O(n).

In the second loop, the solution iterates through the array again, and for each element, it performs a constant number of operations (i.e., 
accessing an array element and checking its sign). Therefore, the time complexity of the second loop is also O(n).

The space complexity of the solution is O(1), because it uses a constant amount of extra space to store the result array `result`, 
which has a fixed length of 2, regardless of the length of the input array `nums`. The solution modifies the input array `nums` in place, 
so it does not require any additional space proportional to the length of the input array. Therefore, the space complexity of the solution is constant, or O(1).
*/
