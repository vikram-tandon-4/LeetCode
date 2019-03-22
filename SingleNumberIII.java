
/*
 Given an array of numbers nums, in which exactly two elements appear only once 
 and all the other elements appear exactly twice. Find the two elements that appear only once.

Example:

Input:  [1,2,1,3,2,5]
Output: [3,5]
Note:

The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */
import java.util.HashSet;
import java.util.Iterator;

public class SingleNumberIII {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 3, 2, 5 };
		int[] arr = singleNumber(nums);
		System.out.println(arr[0] + " " + arr[1]);
	}

	public static int[] singleNumber(int[] nums) {
		HashSet<Integer> arr = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (arr.contains(nums[i])) {
				arr.remove(nums[i]);
			} else {
				arr.add(nums[i]);
			}
		}
		Iterator iter = arr.iterator();

		int[] single = { (int) iter.next(), (int) iter.next() };
		return single;
	}
}
