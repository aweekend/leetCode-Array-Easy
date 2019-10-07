package leetCode.array.easy;

public class Solution {

	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int result = searchInsert(nums,7);
		System.out.print(Integer.valueOf(result));
		int l=1;
		int r=2;
		int m=(l+r)/2;
		System.out.print(Integer.valueOf(m));


	}
	public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int mid = 0;
        while(left<right){
        	mid = (left+right)/2;
        	if(nums[mid]==target)
        		return mid;
        	else if(nums[mid]<target)
        		left = mid +1;             //此时nums[mid]可以舍弃
        	else
        		right = mid;               //此时不能省略，因为除法不是四舍五入，只取整数位，如果舍去则取不到最后一位
        }
        
		return left;
    }
}
