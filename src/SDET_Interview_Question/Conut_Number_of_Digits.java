package SDET_Interview_Question;

public class Conut_Number_of_Digits {
	
	public static void main(String[] args) {
		
		int num=12345;
		
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("Number of Digits : "+ count);
	}

}
