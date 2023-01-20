package string_Questions;
import java.io.*;
import java.util.ArrayList;

public class Second_Que {
	static int[] method(String str)
	{
		String[] splitArray = str.split("");
		int[] array = new int[splitArray.length];
		for (int i = 0; i < splitArray.length; i++) {
			array[i] = Integer.parseInt(splitArray[i]);
		}
		return array;
	}

	// main method
	public static void main(String[] args)
	{
		String s1 = "10010001";
		String s2 = "11000011";

		int[] array = method(s1);
		int[] array1 = method(s2);
		
		ArrayList al = new ArrayList();
		
		for(int i=0;i<=7;i++) {
			if(i==0) {
				al.add(array[i]*array1[i]);
			}
			else if(i<7){
				al.add(array[i]+array1[i]);
			}
			else {
				al.add(array[i]*array1[i]);
			}
		}
		
	StringBuffer Final = new StringBuffer();		
		for(int a=0;a<al.size();a++) {
			Final=Final.append(al.get(a));
		}		
		System.out.println(Final);
	}
}
