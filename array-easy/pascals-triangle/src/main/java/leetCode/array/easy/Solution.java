package leetCode.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zpf
 * 杨辉三角第n行其实是排列组合阶乘公式(C)
 */
public class Solution {

	public static void main(String[] args) {
		
		generate(3);
	}
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        if(numRows<=0)
        	return answer;
        for(int i=0;i<numRows;i++){
        	 List<Integer> subList = new ArrayList<Integer>();
        	for(int j=0;j<=i;j++){
        		if(j==0){
        			subList.add(1);
        		}else if(j==i){
        			subList.add(1);
        		}else
        			subList.add(answer.get(i-1).get(j-1)+answer.get(i-1).get(j));
        	}
        	
        	answer.add(subList);	
        }
		return answer;
    }
}
