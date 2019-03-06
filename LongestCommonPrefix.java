/*
 Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {

		String shortest = getShortest(strs);
		String prefix = "";

		for (int i = 0; i < shortest.length(); i++) {
			String matchPrefix = shortest.substring(0, i + 1);
			for (int j = 0; j < strs.length; j++) {
				if (!matchPrefix.equals(strs[j].substring(0, i + 1))) {
					return prefix;
				}
			}
			prefix = matchPrefix;
		}
		return prefix;
	}

	public static String getShortest(String[] strs) {
		int minLength = Integer.MAX_VALUE;
		String shortest = "";

		for (String str : strs) {
			if (str.length() < minLength) {
				shortest = str;
				minLength = str.length();
			}
		}
		return shortest;
	}
}
