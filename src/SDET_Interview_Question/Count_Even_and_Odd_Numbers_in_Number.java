package SDET_Interview_Question;

public class Count_Even_and_Odd_Numbers_in_Number {
	
	public static void main(String[] args) {
		
		int num = 2834545;
		int even_count=0;
		int odd_count=0;
		
		while(num>0) {
			
			int rem=num%10;
			if(rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			
			num=num/10;
		}
				
		System.out.println(even_count);
		
		System.out.println(odd_count);
		
		
		
	}

}
