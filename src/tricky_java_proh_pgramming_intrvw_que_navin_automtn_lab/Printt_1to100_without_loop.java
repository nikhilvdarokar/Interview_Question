package tricky_java_proh_pgramming_intrvw_que_navin_automtn_lab;

public class Printt_1to100_without_loop {

	/**
	 * print 1 to 100 without using any loop
	 * 1. recrsive function
	 * 2. Java Streams
	 */
	
	public static void main(String[] args) {
	
		printNum(1);
		System.out.println();
		printNum(1,100);
	}
	
	public static void printNum(int num) {
		
		if(num<=100) {
			System.out.print(num+" ");
			num++;
			printNum(num);
		}	
	}
	
	public static void printNum(int stNum, int endNum) {
		if(stNum<=100) {
			System.out.print(stNum+" ");
			stNum++;
			printNum(stNum,endNum);
		}	
		
	}
	
	
	
}
