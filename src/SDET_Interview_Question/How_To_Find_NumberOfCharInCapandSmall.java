package SDET_Interview_Question;

public class How_To_Find_NumberOfCharInCapandSmall {
	
	public static void main(String[] args) {
		
		String s1 = "Welcome to Automation";
		
		int CountofLower=0;
		int CountofUpper=0;
		
		for(int i=0;i<s1.length();i++) {
			
			char ch = s1.charAt(i);
			
			if(ch>=65 && ch<=90) {
				CountofUpper++;
			}
			else {
				CountofLower++;
			}
		}
		
		System.out.println("Count of Lower letters are " + CountofLower) ;
			
		System.out.println("Count of upper letters are " + CountofUpper);
		
		
		
		
		
	}

}
