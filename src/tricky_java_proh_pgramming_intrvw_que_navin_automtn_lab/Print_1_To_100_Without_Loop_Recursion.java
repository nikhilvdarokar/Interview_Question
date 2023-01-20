package tricky_java_proh_pgramming_intrvw_que_navin_automtn_lab;

import java.util.Arrays;
import java.util.BitSet;
import java.io.*;


public class Print_1_To_100_Without_Loop_Recursion {
	
	
	public static void main(String[] args) {
		//1. Arrays Fill:
		Object num[] = new Object[100];
		
		Arrays.fill(num, new Object() {
			int count =0;
			@Override
			public String toString() {
				return Integer.toString(++count);
			}
		});
		
		System.out.println(Arrays.toString(num));
	}
	
	
	
	//2 BitSet
	
	String set = new BitSet() {{set(1,101);}}.toString();
	
	

}
