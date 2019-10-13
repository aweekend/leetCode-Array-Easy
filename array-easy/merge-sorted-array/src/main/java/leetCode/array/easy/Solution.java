package leetCode.array.easy;

public class Solution {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = {2,5,6};
		int n = 3;
		merge(nums1,m,nums2,n);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        System.arraycopy(nums1, 0, nums1Copy, 0, m);
        int i = 0;
        int j = 0;
        if(n<=0){
        	return;
        } 
        while(i<m&&j<n){
        	if(nums1Copy[i]<nums2[j]){
        		nums1[i+j]=nums1Copy[i];
        		i++;
        	}else{
        		nums1[i+j]=nums2[j];
        		j++;
        	}
        }
        if(i<m){
        	System.arraycopy(nums1Copy, i, nums1, i+j, m+n-i-j);
        }
        if(j<n){
        	System.arraycopy(nums2, j, nums1, i+j, m+n-i-j);
        }
    }
}
