
/*
 Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Note:

Each element in the result must be unique.
The result can be in any order.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {

		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };
		int[] arr = intersection(nums1, nums2);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		int[] arr;
		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();

		for (int i = 0; i < nums1.length; i++) {
			hs1.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			hs2.add(nums2[i]);
		}

		List<Integer> common = new ArrayList<>();
		for (int item : hs1) {
			if (hs2.contains(item)) {
				common.add(item);
			}
		}

		arr = new int[common.size()];
		int i = 0;
		for (int item : common) {
			arr[i] = item;
			i++;
		}
		return arr;
	}

}
