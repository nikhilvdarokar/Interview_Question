package SDET_Interview_Question;

public class Sum_of_Elements_of_Array {
	
	public static void main(String[] args) {
		
		int ar[] = {1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		
		System.out.println(sum);
		
		for(int value:ar) {
			sum=sum+value;
		}
		System.out.println(sum);
	}

}
