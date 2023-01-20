package SDET_Interview_Question;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number : ");
		
		int num= sc.nextInt();
		
		int org_num=num;
		
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if(org_num==rev) {
			System.out.println(org_num + " It is Palindromer Number");
		}
		else {
			System.out.println(org_num + " It is not Palindromer Number");
		}
		
		sc.close();
		
		

	}
}
