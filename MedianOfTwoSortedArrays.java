
public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1= {1,2};
		int[] nums2 = {3,4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
	
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        
	        int n= nums1.length, m= nums2.length;
	        int[] arr = new int[n+m];
	        
	        int last = (n + m)/2 +1;
	        
	        boolean lastTwo;
	        
	        if((n+m) % 2 == 0){
	           lastTwo = true; 
	        }else{
	            lastTwo = false; 
	        }
	        
	        int iteratorNums1 = 0, iteratorNums2 = 0;
	        for(int i = 0;i< last;i++){
	            
	            if(iteratorNums1 == n){
	                arr[i] = nums2[iteratorNums2];
	                iteratorNums2++;
	            }else if(iteratorNums2 == m){
	                arr[i] = nums1[iteratorNums1];
	                iteratorNums1++;
	            }else if(nums1[iteratorNums1] < nums2[iteratorNums2]){
	                 arr[i] = nums1[iteratorNums1];
	                iteratorNums1++;
	            }else{
	                arr[i] = nums2[iteratorNums2]; 
	                iteratorNums2++;
	            }
	        }
	        if(lastTwo){
	            return (double)(arr[last-1] + arr[last-2])/2;
	        }
	        
	        return (double)arr[last-1];
	    }

}
