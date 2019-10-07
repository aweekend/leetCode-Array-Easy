package leetCode.array.easy;

public class Solution {

	public static void main(String[] args) {
		int[] digits = {9};
		plusOne(digits);

	}
	
	public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
        	if(digits[i]==9){
        		digits[i]=0;
        	}else{
        		digits[i]=digits[i]+1;
        		break;
        	}
        }
        if(digits[0]==0){
        	int[] tmpDigits = new int[digits.length+1];
        	tmpDigits[0]=1;
        	for(int i=1;i<tmpDigits.length;i++)
        		tmpDigits[i]=0;
        	return tmpDigits;
        }
		return digits;
    }
}
