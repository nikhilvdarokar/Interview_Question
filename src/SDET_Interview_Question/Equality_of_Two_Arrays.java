package SDET_Interview_Question;

import java.util.Arrays;

public class Equality_of_Two_Arrays {
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7};
		
		int ar1[]= {1,2,3,4,5,6};
		
		boolean status = Arrays.equals(ar, ar1);
		if(status==true) {
			System.out.println("Both The Arrays are Equals");
		}
		else {
			System.out.println("Both The Arrays are NOT Equals");
		}
	}

}
