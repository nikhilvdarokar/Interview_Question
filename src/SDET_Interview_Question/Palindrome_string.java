package SDET_Interview_Question;

import java.util.Scanner;

public class Palindrome_string {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Check your string is Palindrome or Not , Enter your String : ");
		String s1 = sc.next();
		
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		
		if(rev.equals(s1)) {
			System.out.println(s1 + ": It is Palindrome String");
		}
		else {
			System.out.println(s1+": It is not Palindrome String");
		}
		
		sc.close();
	}

}
