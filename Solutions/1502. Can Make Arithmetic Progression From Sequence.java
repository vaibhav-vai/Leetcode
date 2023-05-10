// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/description/



class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length == 2)
            return true;
        Arrays.sort(arr);
        int length = arr.length;
        int difference = arr[1] - arr[0];
        for (int i = 2; i < length; i++) {
            if (arr[i] - arr[i - 1] != difference)
                return false;
        }
        return true;
    }
}


/*
Explanation

This Java code checks whether a given array of integers forms an arithmetic progression. An arithmetic progression is a sequence of numbers in 
which each number is the sum of the preceding number and a fixed constant difference.

Here's a line-by-line explanation of the code:

1. `public boolean canMakeArithmeticProgression(int[] arr) {`: This line defines a public method called `canMakeArithmeticProgression` 
that takes an array of integers `arr` as input and returns a boolean value.

2. `if (arr.length == 2) return true;`: This line checks if the input array has only two elements. If so, the method immediately returns true, 
since any two-element sequence is trivially an arithmetic progression.

3. `Arrays.sort(arr);`: This line sorts the input array `arr` in ascending order using the `Arrays.sort()` method. This is done to make it easier to 
check whether the array forms an arithmetic progression.

4. `int length = arr.length;`: This line creates an integer variable `length` and initializes it to the length of the sorted input array. 
This variable will be used to iterate over the elements of the array in the following loop.

5. `int difference = arr[1] - arr[0];`: This line creates an integer variable `difference` and initializes it to the difference between the 
second and first elements of the sorted input array. This difference will be used to check whether the array forms an arithmetic progression in the 
following loop.

6. `for (int i = 2; i < length; i++) {`: This line starts a `for` loop that iterates over the remaining elements of the sorted input array, 
starting at the third element (index 2) and ending at the last element (index `length-1`).

7. `if (arr[i] - arr[i - 1] != difference) return false;`: This line checks whether the difference between the i-th and (i-1)-th elements of 
the sorted input array is equal to the fixed difference `difference`. If the difference is not equal to `difference`, the method immediately returns false, 
since the array does not form an arithmetic progression.

8. `return true;`: This line is reached if the entire loop completes without returning false. In this case, the method returns true, 
indicating that the input array forms an arithmetic progression.

Overall, this code has a time complexity of O(n log n), where n is the length of the input array. This is because the code sorts the input array 
using the `Arrays.sort()` method, which has a worst-case time complexity of O(n log n), and then performs a linear amount of work to iterate over 
the sorted array and check whether it forms an arithmetic progression. However, since n is always a small number in this problem (the input array 
has at most 1000 elements), the actual running time of the code is very fast in practice.

The space complexity of this code is O(1), because it uses only a constant amount of extra space to store the `length` and `difference` variables. 
The `Arrays.sort()` method sorts the input array in place, so it does not require any extra space beyond the input array itself. The code does not 
create any new data structures or arrays that depend on the size of the input array, so the space complexity is constant with respect to the size of 
the input array.
*/
