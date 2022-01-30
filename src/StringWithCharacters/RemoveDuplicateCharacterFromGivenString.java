package StringWithCharacters;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacterFromGivenString {
	public static void main(String[] args) {
		String s = "welcome to TYSS welcome";
		String [] str = s.split(" ");
		//create any set collection and all the character of given string into set
		LinkedHashSet<String> set = 	new LinkedHashSet<String>();
		for(int i = 0;i<str.length;i++) {
	        set.add(str[i]);
		}
		for(String ch  : set) {
	        System.out.print(ch + " " );
}
	}
}
