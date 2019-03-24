import java.util.HashMap;

class TwoSum {
	// public int[] twoSum(int[] nums, int target) {
	//
	// int[] arr= new int[2];
	//
	// for(int i=0;i<nums.length-1;i++){
	//
	// for(int j=i+1;j<nums.length;j++){
	//
	// if(nums[i] + nums[j] ==target){
	// arr[0]= i;
	// arr[1] = j;
	// return arr;
	// }
	// }
	// }
	// return arr;
	// }

	// Solution 2:

	public static void main(String[] args) {
		int[] numbers = { 3, 3 };
		int[] arr = twoSum(numbers, 6);
		System.out.println("Position1 = " + arr[0] + " Position2 = " + arr[1]);

	}

	public static int[] twoSum(int[] nums, int target) {

		int[] arr = new int[2];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(target - nums[i])) {
				return new int[] { i, hm.get(target - nums[i]) };	
			}
				hm.put(nums[i], i);
		}
		return arr;
	}
}