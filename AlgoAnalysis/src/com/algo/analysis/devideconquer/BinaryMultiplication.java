/**
 * 
 */
package com.algo.analysis.devideconquer;

import java.util.Arrays;

/**
 * @author NAYAKDUR
 *
 */
public class BinaryMultiplication {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryMultiplication binaryMultiplication = new BinaryMultiplication();
		String val  = "8";
		Integer intVal =  Integer.parseInt(val);
		BinaryConversion binaryConversion = new BinaryConversion(intVal);
		for (int i = 0; i < binaryConversion.getBinaryVal().length; i++) {
//			System.out.print(binaryConversion.getBinaryVal()[i]);
		}
		System.out.println("");
//		binaryMultiplication.multiply(binaryConversion.getBinaryVal(), binaryConversion.getBinaryVal());
		
		
		
		Byte b = new Byte((byte) 8);
		System.out.println("b.SIZE"+b.byteValue());
		
		System.out.println(b.toString());
		
		System.out.println(b*b);
	}
	public int multiply (int[] first, int[] two ) {
		
		int n = first.length > two.length ? first.length : two.length;
		if (n == 1) {
//			System.out.println("***"+first[0]*two[0]);
			return first[0]*two[0];
		}
		int mid = first.length/2;
		int firstLeft[] = Arrays.copyOfRange(first, 0, mid);
		int firstRight[] = Arrays.copyOfRange(first, mid, first.length - mid + 1);
		
		System.out.println("len"+firstLeft.length+"ren"+firstRight.length);
		
		int midtwo = two.length/2;
		int twoLeft[] = Arrays.copyOfRange(first, 0, midtwo);
		int twoRight[] = Arrays.copyOfRange(first, midtwo, two.length - midtwo +1);
		System.out.println("lenR"+twoLeft.length+""+twoRight.length);
		
		int p1= multiply(firstLeft, twoLeft);
		int p2= multiply(firstRight, twoRight);
		System.out.println(p1+""+p2);
//		 int p3 = multiply(firstLeft + firstRight, twoLeft + twoRight);
		return p1 + p2;
		
	}
	
}
