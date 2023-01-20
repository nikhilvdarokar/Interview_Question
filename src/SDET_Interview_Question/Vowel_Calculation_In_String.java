package SDET_Interview_Question;

public class Vowel_Calculation_In_String {
	
	public static void main(String[] args) {
		
		String s1 = "The Great Artist";
		
		int CountofVowel=0;
		for(int i=0;i<s1.length();i++) {
			char ex = s1.charAt(i);
			if(ex=='a'||ex=='A'||ex=='e'||ex=='e'||ex=='i'||ex=='I'||ex=='o'||ex=='O'||ex=='u'||ex=='U') {
				CountofVowel++;
			}
			
		}
		System.out.println(CountofVowel);
	}

}
