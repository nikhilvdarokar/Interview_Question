package string_Questions;

import java.util.HashMap;
import java.util.Map;

public class char_count {
	
	public static void main(String[] args) {
		
		String s1 = "sjlfdhkshgfSGfSKHFGafSJHGfjgS";
		
		Map<Character, Integer> charMap =  new HashMap<Character, Integer>();
		
		char[] s1Array = s1.toLowerCase().toCharArray();
		
		for(char c:s1Array) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}
			else {
				charMap.put(c, 1);
				
			}
		}
		System.out.println(charMap);
	}

}
