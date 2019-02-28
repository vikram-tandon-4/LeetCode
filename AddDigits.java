/*
 Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

Input: 38
Output: 2 
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
             Since 2 has only one digit, return it.
 */
public class AddDigits {

	public static void main(String[] args) {
		System.out.println(addDigits(38));
	}

	public static int addDigits(int num) {

		int sum = 0;
		while (num > 0) {

			int rem = num % 10;
			sum += rem;
			num /= 10;

			if (num == 0 && sum > 9) {
				num = sum;
				sum = 0;
			}
		}
		return sum;
	}
}
