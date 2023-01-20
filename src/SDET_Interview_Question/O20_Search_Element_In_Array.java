package SDET_Interview_Question;

public class O20_Search_Element_In_Array {
public static void main(String[] args) {
	
	int ar[] = {1,2,3,4,5,6,76,7,7,8,8,54,9};
	
	int a=70;
	boolean flag=false;
	for(int i=0;i<ar.length;i++) {
		if(ar[i]==a) {
			System.out.println("Element found in the Array at Position : "+ i);
			flag=true;
			break;
		
		}
	}
	

	if(flag==false) {
			System.out.println("Element not found in Array");
	}
}
}
