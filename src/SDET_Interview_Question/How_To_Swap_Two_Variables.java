package SDET_Interview_Question;

public class How_To_Swap_Two_Variables {
	
	public static void main(String[] args) {
		
		int a = 20;
		int b=10;
		int t =a;
		a=b;
		b=t;
		System.out.println(a);
		System.out.println(b);
		
		int c=10;
		int d=20;
		c=c*d;
		
		d=c/d;
		c=c/d;
		System.out.println(c);
		System.out.println(d);
		
		int e=10;
		int f=20;
		e=e+f;
		f=e-f;
		e=e-f;
		System.out.println(e);
		System.out.println(f);
		
	}

}
