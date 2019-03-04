/*
 * Count the number of prime numbers less than a non-negative number, n.
 * Input: 10
 *Output: 4
 *Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */
public class CountPrime {

	public static void main(String[] args) {
		System.out.println(countPrimes(10));
	}

	public static int countPrimes(int n) {

		int count = 0;

		if (n == 3) {
			count = 1;
		}
		if (n > 3) {
			count = 2;
		}

		for (int i = 5; i < n; i += 2) {

			if (checkPrime(i)) {
				count++;
			}
		}

		return count;
	}

	public static boolean checkPrime(int p) {

		for (int i = 2; i <= Math.sqrt(p); i++) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}

}
