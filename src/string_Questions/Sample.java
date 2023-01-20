package string_Questions;

public class Sample {
	public static void main(String[] args) {
		String s1 = "10010001";
		String s2 = "11000011";
		String output = "";
		
		for(int i=0;i<s1.length();i++) {
			if((s1.charAt(i)=='1')||(s2.charAt(i)=='1')) {
				output =output.concat("1");
			}
			else {
				output=output.concat("0");
			}
		}
		System.out.println(output);
		
		
	}

}
