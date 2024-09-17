package Araays;

import java.lang.reflect.Array;

public class LargestAndSmallest {
	public static void main(String[] args) {
		int array[]= {12,39,108,127,89,29,87,16,18,23};
		int maxNumber=array[0];
		int minNumber=array[0];
		for (int i=0;i<array.length;i++) {
			if(maxNumber<array[i]) {
				maxNumber=array[i];
			}else if (minNumber>array[i]) {
				minNumber=array[i];
			}	
			}
		System.out.println("Maximum Number:"+maxNumber+"Minimum Number:"+minNumber);
		}
	}


