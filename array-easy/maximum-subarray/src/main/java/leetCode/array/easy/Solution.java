package leetCode.array.easy;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int maxSubArray(int[] nums) {
		 int tmp = 0;                                  //设tmp为连续子序列的和，初始值设为0，使tmp+=nums[0]之后为nums[0]
		 int ans = nums[0];                           //ans为最大连续子序列的和,初始值设为nums[0]
		 for(int i=0;i<nums.length;i++){
			 if(tmp>0){                          //如果tmp大于0，则继续向后一个数字相加时，对后一个数字有增益效果，否则不如直接使用后一个数字开始
				 tmp +=nums[i];
			 }else{                              //如上面所说，tmp如果小于0，则从后一个数字开始
				 tmp = nums[i];
			 }
			 ans = Math.max(ans, tmp);           //每次循环，ans都取较大的值，则最终ans为最大连续子序列的和
		 }
		 return ans;
	    }
}
