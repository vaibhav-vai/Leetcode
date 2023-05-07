// https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/description/



class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] wrappedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(wrappedArr,(a,b) -> Integer.bitCount(a) == Integer.bitCount(b) ? a-b : Integer.bitCount(a) - Integer.bitCount(b));
        return Arrays.stream(wrappedArr).mapToInt(Integer::intValue).toArray();
    }
}



/* Explaination:- 
This Java code takes an array of integers `arr` and returns a new array where each element is replaced with its rank in a sorted version of the input array. 
The rank of an element is the position of the element in the sorted array, with the smallest element having a rank of 1.

Here's a line-by-line explanation of the code:
1. `public int[] arrayRankTransform(int[] arr) {`: This line defines a public method called `arrayRankTransform` that takes an array of integers `arr` as 
input and returns an array of integers.

2. `int[] sortedArr = arr.clone();`: This line creates a copy of the input array `arr` called `sortedArr`. The `clone()` method is used to create a 
new array with the same values as the original array.

3. `Map<Integer, Integer> rank = new HashMap<>();`: This line creates a `Map` called `rank` that will be used to store the rank of each element in the input array. 
The map is created with integer keys and integer values.

4. `Arrays.sort(sortedArr);`: This line sorts the `sortedArr` array in ascending order using the `Arrays.sort()` method.

5. `for (final int a : sortedArr) rank.putIfAbsent(a, rank.size() + 1);`: This line iterates over the sorted array `sortedArr` using a for-each loop. 
For each element `a`, it puts the element as a key in the `rank` map if it doesn't already exist, and assigns it a value equal to the current size of the `rank` 
map plus one. This gives each unique element in `sortedArr` a unique rank.

6. `for (int i = 0; i < arr.length; ++i) arr[i] = rank.get(arr[i]);`: This line iterates over the original array `arr` using a for loop. For each element in `arr`, 
it replaces the element with its rank in the `rank` map using the `get()` method.

7. `return arr;`: This line returns the modified `arr` array.

Overall, the code is using a HashMap to efficiently assign a unique rank to each distinct element in the input array. 
It then maps each element in the input array to its corresponding rank using the `rank` map. Finally, it returns the modified array with the ranks.


Time and Space Complexity:- 
The time complexity of this code is O(n log n), where n is the length of the input array. 
The reason for this is that the code sorts a copy of the input array using the `Arrays.sort()` method, which has a time complexity of O(n log n), 
and then iterates over the sorted array and the input array once each, both of which have a time complexity of O(n).

The space complexity of this code is O(n), where n is the length of the input array. 
The reason for this is that the code creates a copy of the input array using the `clone()` method, which requires an additional array of the same 
size as the input array. It also creates a `Map` called `rank`, which stores the rank of each element in the input array, 
and this map can have up to n entries if all the elements in the input array are distinct. Therefore, the overall space complexity of the code is O(n).
*/
