import java.util.Arrays;

/*
 * 
 * Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class ValidAnagram {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		System.out.println(isAnagram("anagram", "nagaram"));
	}

	public static boolean isAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		if (sort(s).equals(sort(t))) {
			return true;
		} else {
			return false;
		}
	}

	public static String sort(String str) {
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}

}
