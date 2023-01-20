package SDET_Interview_Question;

public class Even_Odd_Numbers_In_A_Array {
	public static void main(String[] args) {
		
		int ar[] = {1,3,34,56,23,45,66,49};
		System.out.print("Odd Numbers From Array :");
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				System.out.print(ar[i] + " ");
			}
		
		}
		
		
	}

}
