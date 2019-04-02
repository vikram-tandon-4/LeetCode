/*
 Given an array of integers that is already sorted in ascending order, 
 find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such
 that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class TwoSumII {

	public static void main(String[] args) {
		int[] numbers = {2,7,11,15};
		int[] arr = twoSum(numbers, 22);
		System.out.println("Position1 = "+ arr[0]+ " Position2 = "+ arr[1] );

	}
	
	
	 public static int[] twoSum(int[] numbers, int target) {
	        int[] arr = new int[2];
	        for(int i=0; i < numbers.length; i++){
	            int position = searchInsert(numbers, target - numbers[i]);
	            
	            if(position!= -1){
	                arr[0] = i+1;
	                arr[1] = position+1;
	                break;
	            }
	        }
	        return arr;
	    }
	    
	    public static int searchInsert(int[] nums, int target) {
			int start = 0, end = nums.length - 1;
			int mid = 0;
			while (start <= end) {
				
				mid = (start + end) / 2;

				if (nums[mid] == target) {
	                if(mid+1 < nums.length){
	                if(nums[mid] == nums[mid+1]){
	                    return (mid+1);
	                }
	                }
					return mid;
				} else if (nums[mid] > target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
			return -1;
		}

}
