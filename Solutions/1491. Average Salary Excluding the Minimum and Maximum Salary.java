// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/



class Solution {
    public double average(int[] salary) {
        final int N = salary.length;
        Arrays.sort(salary);
        double t = salary[1];
        for (int i = 2; i < N - 1; i++) {
            t += salary[i];
        }
        return t / (N - 2);
    }
}


/* Explanation 
This Java code calculates the average salary of a group of employees, excluding the minimum and maximum salaries. 
It does this by sorting the input array of salaries in ascending order, then calculating the sum of all salaries except for the minimum and maximum values, 
and finally dividing this sum by the number of salaries minus two.

Here's a line-by-line explanation of the code:

1. `public double average(int[] salary) {`: This line defines a public method called `average` that takes an array of integers `salary` as input and 
returns a double.

2. `final int N = salary.length;`: This line creates a constant integer variable `N` and initializes it to the length of the input array `salary`. 
This variable represents the number of salaries in the input array.

3. `Arrays.sort(salary);`: This line sorts the input array `salary` in ascending order using the `Arrays.sort()` method.

4. `double t = salary[1];`: This line creates a double variable `t` and initializes it to the second smallest salary in the sorted array. 
This variable will be used to accumulate the sum of all salaries except for the minimum and maximum values.

5. `for (int i = 2; i < N - 1; i++) {`: This line starts a `for` loop that iterates over all salaries in the sorted array except for the minimum 
and maximum values. The loop starts at the third salary in the array (index 2) and ends at the second to last salary in the array (index `N-2`).

6. `t += salary[i];`: This line adds the i-th salary in the sorted array (excluding the first and last values) to the running total `t`.

7. `return t / (N - 2);`: This line computes the average salary by dividing the total sum of salaries (excluding the minimum and maximum values) by 
the number of salaries minus two, and returns this value as the output of the `average` method.

Overall, this code has a time complexity of O(n log n), where n is the length of the input array. This is because the code sorts the input array 
using the `Arrays.sort()` method, which has a worst-case time complexity of O(n log n), and then performs a constant amount of work to compute the 
sum of all salaries except for the minimum and maximum values, which takes O(n) time. However, since n is always a small number in this problem 
(the input array has at most 1000 elements), the actual running time of the code is very fast in practice.

The space complexity of this code is O(1), because it uses only a constant amount of extra space to store the `N` and `t` variables. 
The `Arrays.sort()` method sorts the input array in place, so it does not require any extra space beyond the input array itself. The code does not 
create any new data structures or arrays that depend on the size of the input array, so the space complexity is constant with respect to the size of 
the input array.
