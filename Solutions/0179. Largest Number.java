// https://leetcode.com/problems/largest-number/description/



class Solution {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0){
            return "";
            }
        String[] strs = new String[nums.length];
        for(int i=0; i < nums.length; i++){
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (str1,str2) -> (str2+str1).compareTo(str1+str2));
        if(strs[0].charAt(0) == '0') return "0";
        StringBuilder sb = new StringBuilder();
            for(String s:strs){
                sb.append(s);
            }
            return sb.toString();
    }
}

/*
Explaination
The given code is a Java solution to find the largest number that can be formed by concatenating the elements of an integer array `nums`. 

Here's a step-by-step explanation of the code:

1. The method `largestNumber` takes an integer array `nums` as input and returns a string representing the largest number that can be formed.

2. The code checks if the input array is either `null` or empty (`nums == null || nums.length == 0`). If it is, the method returns an empty string.

3. Next, a new string array `strs` is created with the same length as `nums` to store string representations of the numbers.

4. The `for` loop iterates over each element in `nums` and converts it to a string using `String.valueOf(nums[i])`. The resulting string is 
then stored in the corresponding index of `strs`.

5. After converting all the numbers to strings, the `Arrays.sort` method is used to sort the `strs` array. The sorting is done based on a custom 
comparator `(str1, str2) -> (str2 + str1).compareTo(str1 + str2)`. This comparator compares two strings by concatenating them in different orders 
(`str2 + str1` and `str1 + str2`). The comparison is made in reverse order (`str2 + str1` compared to `str1 + str2`) to achieve the desired result.

6. The code checks if the largest number, which is now the first element of the sorted `strs` array (`strs[0]`), starts with a '0'. If it does, 
it means all the numbers in `nums` were zeroes, and the method returns "0" immediately.

7. If the largest number doesn't start with '0', a `StringBuilder` named `sb` is initialized to store the final result.

8. The code iterates over each string `s` in the sorted `strs` array and appends it to `sb` using the `StringBuilder`'s `append` method.

9. Finally, the method returns the string representation of the concatenated numbers by calling `sb.toString()`.

In summary, the code converts the numbers in the input array to strings, sorts them in descending order based on custom comparison, and then 
concatenates them to form the largest possible number.

The time complexity of the code can be analyzed as follows:

1. Converting the numbers to strings and storing them in the `strs` array takes O(n) time, where n is the length of the `nums` array.

2. Sorting the `strs` array using `Arrays.sort` takes O(n log n) time, as it employs a comparison-based sorting algorithm. The dominant 
factor in the time complexity is the sorting step.

3. The iteration over the `strs` array to append the strings to the `StringBuilder` takes O(n) time.

Therefore, the overall time complexity of the code is O(n log n), where n is the length of the input array `nums`.

The space complexity of the code is as follows:

1. The `strs` array requires O(n) additional space to store the string representations of the numbers.

2. The `StringBuilder` `sb` requires additional space proportional to the total length of the concatenated strings, which can be up to 
O(n log n) in the worst case.

Hence, the overall space complexity of the code is O(n), where n is the length of the input array `nums`.
*/
