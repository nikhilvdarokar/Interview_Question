package SDET_Interview_Question;

import java.util.HashSet;

public class O19_Duplicate_Element_In_Array {
public static void main(String[] args) {
	int ar[] = {1,2,34,2};
/*	boolean flag=false;
	for(int i=0;i<ar.length;i++) {
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]==ar[j]) {
				System.out.println("Found Duplicate Element : "+ar[i]);
				flag=true;
			}
		}
	}
	if(flag==false) {
		System.out.println("Duplicate Element Not Found");
	}
	*/
	
	//Approach 2
	
	HashSet<Integer> hs = new HashSet<Integer>();
	
	boolean flag = false;
	
	for(int i:ar) {
		if(hs.add(i)==false) {
			System.out.println("Found Duplicate Element : " + i);
			flag=true;
		}
	}
	if(flag==false) {
		System.out.println("Duplicate Element Not Found");
	}
}
}
