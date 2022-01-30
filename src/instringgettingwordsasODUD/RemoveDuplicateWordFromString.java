package instringgettingwordsasODUD;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordFromString {
	public static void main(String[] args) {
		String s = "java";
		//create any set collection and all the character of given string into set
		LinkedHashSet<Character> set = 	new LinkedHashSet<Character>();
		for(int i = 0;i<s.length();i++) {
	         set.add(s.charAt(i));
		}
		System.out.println(set);		
		for(Character ch : set) {
			System.out.print(ch);
		}
	    
}
	
}

