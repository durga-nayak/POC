/**
 * 
 */
package com.algo.analysis.devideconquer;

import java.util.Arrays;

/**
 * @author NAYAKDUR
 *
 */
public class BinaryConversion {

	int count = 0;
	int []binaryVal = new int[32];
	
	BinaryConversion(Integer val) {
		convert(val);
		this.binaryVal = Arrays.copyOfRange(this.binaryVal, 0, count);
	}
	
	public int getCount() {
		return count;
	}
	public int[] getBinaryVal() {
		return binaryVal;
	}
	
	private void convert(Integer val) {
		
		if (val == 0 ){
			return;
		}
		convert(val/2);
		binaryVal[this.count] = val%2;
		this.count++;
		
	}

}
