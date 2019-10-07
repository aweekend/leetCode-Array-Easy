package leetCode.array.easy;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int removeDuplicates(int[] nums) {
	     int i = 0;
	     for(int j=1;j<nums.length;j++){
	    	 if(nums[i]==nums[j])                 //如果第i项等于第j项，则j继续向后查找比较
	    		 continue;
	    	 if(nums[i]!=nums[j]){                //直到第i项不等于第j项，将第j项的值赋给第i+1项，同时i向后移动一位
	    		 nums[i+1] = nums[j];             //赋值后，第i+1项已经变成新的值，并且数组是排序数组，j可以继续向后移动
	    		 i=i+1;
	    	 }    		 
	     }
		 return i+1;
	    }
}
