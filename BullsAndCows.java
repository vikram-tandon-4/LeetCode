/*
 You are playing the following Bulls and Cows game with your friend: 
 You write down a number and ask your friend to guess what the number is. 
 Each time your friend makes a guess, you provide a hint that indicates how 
 many digits in said guess match your secret number exactly in both digit 
 and position (called "bulls") and how many digits match the secret number
  but locate in the wrong position (called "cows"). Your friend will use successive
   guesses and hints to eventually derive the secret number.

Write a function to return a hint according to the secret number and friend's guess,
 use A to indicate the bulls and B to indicate the cows. 

Please note that both secret number and friend's guess may contain duplicate digits.

Example 1:

Input: secret = "1807", guess = "7810"

Output: "1A3B"

Explanation: 1 bull and 3 cows. The bull is 8, the cows are 0, 1 and 7.
Example 2:

Input: secret = "1123", guess = "0111"

Output: "1A1B"

Explanation: The 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow.
Note: You may assume that the secret number and your friend's guess only contain digits, and their lengths are always equal.
 */
public class BullsAndCows {

	public static void main(String[] args) {
		System.out.println(getHint("1123", "0111"));

	}

	public static String getHint(String secret, String guess) {

		int len = secret.length();
		int bulls = 0, cows = 0;

		for (int i = 0; i < len; i++) {
			if (secret.charAt(i) == guess.charAt(i)) {
				bulls++;
				secret = secret.substring(0, i) + secret.substring(i + 1, len);
				guess = guess.substring(0, i) + guess.substring(i + 1, len);
				i--;
				len--;
			}
		}
		
		for (int i = 0; i < len; i++) {
			if (guess.contains(secret.substring(i, i + 1))) {
				int position = guess.indexOf(secret.substring(i, i + 1).charAt(0));
				guess = guess.substring(0, position) + guess.substring(position + 1, guess.length());
				cows++;
			}
		}

		return bulls + "A" + cows + "B";
	}
}
