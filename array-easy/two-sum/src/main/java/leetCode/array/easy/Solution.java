package leetCode.array.easy;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] twoSum(int[] nums, int target) {
		 int first = 0;
		 int secode = 0;
		 boolean finish = false;
		 for(int i=0;i<nums.length;i++){
			 for(int j=i+1;j<nums.length;j++){       //两数字不在同一个位置
				 if(nums[i]+nums[j] == target){
					 first = i;
					 secode = j;
					 finish = true;
					 break;
				 }else
					 continue;
			 }
			 if(finish)
				 break;
		 }
		 int[] result = {first,secode};
		 return result;
	    }
}
