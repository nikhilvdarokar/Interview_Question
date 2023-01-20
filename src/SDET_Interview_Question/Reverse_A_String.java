package SDET_Interview_Question;

public class Reverse_A_String {
	
	public static void main(String[] args) {
		
		String s1 = "Nikhil";
		
		String rev = "";
		
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		
		System.out.println("This is rev : " + rev);
		
		char[] strArray = s1.toCharArray();
		
		String rev1="";
		
		for(int j=strArray.length-1;j>=0;j--) {
			rev1=rev1+strArray[j];
		}
		System.out.println("This is rev1 : " + rev1);
		
		//Third Way
		
		StringBuffer s2 = new StringBuffer();
		
		s2.append(s1);
		
		System.out.println("This is s2's Reverse : " + s2.reverse());
		
		
		
		
		
	}
	

}
