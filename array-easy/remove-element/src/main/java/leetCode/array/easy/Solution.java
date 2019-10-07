package leetCode.array.easy;

/**
 * @author zpf
 * 同《remove-duplicates-from-sorted-array》
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
        	if(nums[j]!=val){
        		nums[i]=nums[j];
        		i++;
        	}
        }
		
		return i;
    }
	

}
