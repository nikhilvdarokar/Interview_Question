package SDET_Interview_Question;

public class Missing_Number_In_Array {
	public static void main(String[] args) {
		
		int ar[] = {1,2,3,4,5,6,7,9};
		
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<ar.length;i++) {
			sum1=sum1+ar[i];
		}
		
		for(int i=0;i<=9;i++) {
			sum2=sum2+i;
		}
		
		System.out.println("The missing number in a array : " + (sum2-sum1));
		
	}

} 
