package instringgettingwordsasODUD;

import java.util.LinkedHashSet;

public class OccuranceWordInString {
public static void main(String[] args) {
	String s = "Mahabhrat";
	//create any set collection and all the character of given string into set
	LinkedHashSet<Character> set = 	new LinkedHashSet<Character>();
	for(int i = 0;i<s.length();i++) {
        set.add(s.charAt(i));
	}
	System.out.println(set);
	for(Character ch  : set) {
		int count = 0;
    //compare eaxch char of set with all the change of givern string
		for(int i=0;i<s.length();i++) {
			if(ch==s.charAt(i)) {
	//if char is matching increament of count
				count++;
			}
		}
    //print both char of set and count
		System.out.println(ch  + " is " + count);
	}
}
}
