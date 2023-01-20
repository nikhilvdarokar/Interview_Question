package SDET_Interview_Question;

import java.util.Scanner;

public class Reverse_A_Number {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	
	int num = sc.nextInt();
	
	//Using Algorithm
	
	int rev=0;
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
	}
	
	System.out.println("Reverse number is : " + rev);
			
System.out.println("Enter a number");
	
	int num1 = sc.nextInt();

	StringBuffer s1 = new StringBuffer(String.valueOf(num1));
	
	StringBuffer rev1 = s1.reverse();
	
	System.out.println(rev1);
			
	sc.close();
}

}
