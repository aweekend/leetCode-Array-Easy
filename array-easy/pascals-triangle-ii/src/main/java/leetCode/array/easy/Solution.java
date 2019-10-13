package leetCode.array.easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zpf
 *
 */
public class Solution {

	public static void main(String[] args) {
		getRow(21);
		
	}
	public static List<Integer> getRow(int rowIndex) {
        List<Integer> answer = new ArrayList<Integer>();
        answer.add(1);   
        
        if(rowIndex==0)
        	return answer;
        for(int i=1;i<=rowIndex;i++){
        	BigInteger up = BigInteger.valueOf(rowIndex);
        	BigInteger down = BigInteger.valueOf(1);
        	for(int x=1;x<i;x++){
        		up =up.multiply(BigInteger.valueOf(rowIndex-x));
        		down =down.multiply(BigInteger.valueOf(x+1));
        	}
        	BigInteger div = up.divide(down);
        	answer.add(div.intValue());
        }
		
		return answer;
    }
}
