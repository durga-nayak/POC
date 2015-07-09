/**
 * 
 */
package com.algo.analysis;

import java.util.Arrays;

/**
 * @author NAYAKDUR
 *
 */
public class InversionCount {
	int numbers[];
	int inversionCount;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {1,4,2,45,3,67,5,66,55,0};
		InversionCount inversionCount =  new InversionCount();
		inversionCount.numbers = Arrays.copyOf(numbers, numbers.length);
		int lowerIndex = 0;
		int higherIndex = numbers.length - 1;
//		System.out.println(lowerIndex+""+higherIndex);
		System.out.println("=====StackBegin===========");
		inversionCount.inversionCount(lowerIndex, higherIndex);
		System.out.println("inverseCount"+inversionCount.inversionCount);
		System.out.println("=====ENd===========");
		for ( int i=lowerIndex;i<=higherIndex;i++){
//			System.out.print(inversionCount.numbers[i]+",");
		}
//		System.out.println("===========");
	}

	
	int inversionCount(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {

			int mid = lowerIndex + (higherIndex - lowerIndex) / 2;
			inversionCount(lowerIndex, mid);
			inversionCount(mid + 1, higherIndex);
			
			
//			System.out.println("");
//			System.out.println("lowerIndex::"+lowerIndex);
//			System.out.println("high::"+higherIndex);
//			System.out.println("mid::"+mid);
//			for ( int i=lowerIndex;i<=mid;i++){
//				System.out.print(this.numbers[i]+",");
//			}
//			System.out.println("");
//			for ( int i=mid+1;i<=higherIndex;i++){
//				System.out.print(this.numbers[i]+",");
//			}
//			System.out.println("");
//			System.out.println("=====ItemEnd===========");
			int tempArray[] = new int[higherIndex+1];
			for ( int i=lowerIndex;i<=higherIndex;i++){
				tempArray[i] = this.numbers[i];
//				System.out.print(tempArray[i]+",");
			}
//			System.out.println("===");
			int i = lowerIndex;
			int j = mid+1;
			int k = lowerIndex;
			
			while (i <= mid && j <= higherIndex) {
				if(tempArray[i] < tempArray[j]){
					numbers[k] = tempArray[i];
					i++;
					k++;
				}else if(tempArray[i] > tempArray[j]){
					numbers[k] = tempArray[j];
					j++;
					k++;
					System.out.println("index"+((mid - i)+1));
					inversionCount += ((mid - i)+1);
				}
				
				
			}
			
			 // Copy the rest of the left side of the array into the target array
		    while (i <= mid) {
		      numbers[k] = tempArray[i];
		      k++;
		      i++;
		    }
			
			
		}
		return 0;
	}
}
