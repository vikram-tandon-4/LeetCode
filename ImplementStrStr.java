/*
 Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
public class ImplementStrStr {

	public static void main(String[] args) {
		System.out.println(strStr("hello", "ll"));

	}

	public static int strStr(String haystack, String needle) {

		if (needle == null || needle.length() == 0) {
			return 0;
		}

		if (!haystack.contains(needle)) {
			return -1;
		}

		boolean found = false;

		int start = 0, len = needle.length();
		while (!found) {
			if (haystack.substring(start, start + len).equals(needle)) {
				found = true;
				return start;
			}
			start++;
		}
		return start;
	}
}
