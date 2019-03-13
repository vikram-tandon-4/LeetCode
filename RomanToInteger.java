/*
 Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, two is written as II in Roman numeral, just two one's added together. 
Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. 
However, the numeral for four is not IIII. Instead, the number four is written as IV.
 Because the one is before the five we subtract it making four. The same principle 
 applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

Example 1:

Input: "III"
Output: 3
Example 2:

Input: "IV"
Output: 4
Example 3:

Input: "IX"
Output: 9
Example 4:

Input: "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 5:

Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInt("LVIII"));

	}

	public static int romanToInt(String s) {
		int sum = 0;
		HashMap<String, Integer> numeral = new HashMap<String, Integer>();

		numeral.put("I", 1);
		numeral.put("V", 5);
		numeral.put("X", 10);
		numeral.put("L", 50);
		numeral.put("C", 100);
		numeral.put("D", 500);
		numeral.put("M", 1000);

		for (int i = s.length() - 1; i >= 0; i--) {

			if (i != 0 && s.charAt(i) == 'V' && s.charAt(i - 1) == 'I') {
				sum += 4;
				i--;
			} else if (i != 0 && s.charAt(i) == 'X' && s.charAt(i - 1) == 'I') {
				sum += 9;
				i--;
			} else if (i != 0 && s.charAt(i) == 'L' && s.charAt(i - 1) == 'X') {
				sum += 40;
				i--;
			} else if (i != 0 && s.charAt(i) == 'C' && s.charAt(i - 1) == 'X') {
				sum += 90;
				i--;
			} else if (i != 0 && s.charAt(i) == 'D' && s.charAt(i - 1) == 'C') {
				sum += 400;
				i--;
			} else if (i != 0 && s.charAt(i) == 'M' && s.charAt(i - 1) == 'C') {
				sum += 900;
				i--;
			} else {
				sum += numeral.get(s.substring(i, i + 1));
			}
		}
		return sum;
	}
}
