package SDET_Interview_Question;

public class Count_Sum_of_Digits {
	public static void main(String[] args) {
		int num =12973;
		int sum=0;
		
		while(num>0) {
			sum=sum+num%10;
			
			num=num/10;
			
		}
		
		System.out.println(sum);
	}

}
