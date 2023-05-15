//https://leetcode.com/problems/group-anagrams/description/



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Check for empty inputs
    if (strs == null || strs.length == 0)
      return new ArrayList<>();

    Map<String, List<String>> frequencyStringsMap = new HashMap<>();
    for (String str : strs) {

      String frequencyString = getFrequencyString(str);

      // If the frequency string is present, add the string to the list
      if (frequencyStringsMap.containsKey(frequencyString)) {
        frequencyStringsMap.get(frequencyString).add(str);
      }
      else {
        // else create a new list
        List<String> strList = new ArrayList<>();
        strList.add(str);
        frequencyStringsMap.put(frequencyString, strList);
      }
    }

    return new ArrayList<>(frequencyStringsMap.values());
  }

  private String getFrequencyString(String str) {

    // Frequency buckets
    int[] freq = new int[26];

    // Iterate over each character
    for (char c : str.toCharArray()) {
      freq[c - 'a']++;
    }

    // Start creating the frequency string
    StringBuilder frequencyString = new StringBuilder("");
    char c = 'a';
    for (int i : freq) {
      frequencyString.append(c);
      frequencyString.append(i);
      c++;
    }

    return frequencyString.toString();
    }
}

/* Explaination

This is a Java solution to group anagrams in a given array of strings. An anagram is a word or phrase formed by rearranging the letters of a 
different word or phrase, typically using all the original letters exactly once. The goal is to group together all the strings that are anagrams of each other.

The main method in this solution is `groupAnagrams`, which takes in an array of strings called `strs` and returns a list of lists of strings, 
where each sublist contains strings that are anagrams of each other. The method first checks if the input is empty, and returns an empty list if it is.

It then creates a `Map` called `frequencyStringsMap`, which will be used to store the frequency strings and their corresponding anagrams. 
The `getFrequencyString` method is used to generate a frequency string for each input string, which is a string containing the counts of each 
character in the input string, sorted alphabetically. For example, the frequency string for "eat" would be "1a1e1t".

The `groupAnagrams` method iterates over each string in the input array `strs`, generates its frequency string using `getFrequencyString`, 
and adds the string to the corresponding list in `frequencyStringsMap`. If the frequency string is not present in the map, a new list is created 
and the string is added to it.

Finally, the method returns a list containing all the values (lists of anagrams) in the `frequencyStringsMap`.

Overall, this solution has a time complexity of O(n * k log k), where n is the number of strings in the input array and k is the length of the 
longest string, due to the sorting operation in `getFrequencyString`.

The space complexity of this code is O(n * k), where n is the number of strings in the input array and k is the maximum length of the strings. 

The primary contributor to the space complexity is the `frequencyStringsMap`, which is a `HashMap` that stores the frequency strings as keys and 
the corresponding anagrams as values. In the worst case scenario, where all the strings in the input array are unique and have different frequency 
strings, the map will have n entries. Each entry consists of a frequency string (with a length of k) and a list of strings, which can have a combined 
length of k. Therefore, the space complexity of the map is O(n * k).

Additionally, the `getFrequencyString` method uses an array `freq` of size 26 to store the frequency counts of each character. Hence, the space 
complexity of this array is constant, O(26), which simplifies to O(1).

Overall, the total space complexity is O(n * k) because the map dominates the space usage.

Regarding the time complexity, the code has a time complexity of O(n * k log k).

The `groupAnagrams` method iterates over each string in the input array, which takes O(n) time. For each string, it calls the `getFrequencyString` 
method, which iterates over each character and increments the corresponding frequency count, taking O(k) time. After that, the frequency string is 
created by iterating over the frequency count array, which takes O(k) time. Sorting the frequency string requires O(k log k) time complexity since 
the sorting operation has a time complexity of O(k log k) due to the use of `Arrays.sort` method.

Overall, the time complexity of the code is O(n * k log k) since the worst-case scenario involves iterating over all the strings in the input 
array and performing the O(k log k) sorting operation for each string.
*/
