package StringWithCharacters;

import java.util.LinkedHashSet;

public class UniqueWordOfGivenString {
public static void main(String[] args) {
	String s = "welcome to TYSS welcome";
	String [] str = s.split(" ");
	//create any set collection and all the character of given string into set
	LinkedHashSet<String> set = 	new LinkedHashSet<String>();
	for(int i = 0;i<str.length;i++) {
        set.add(str[i]);
	}
///	System.out.println(set);
	for(String ch  : set) {
		int count = 0;
    //compare eaxch char of set with all the change of givern string
		for(int i=0;i<str.length;i++) {
			if(ch.equals(str[i])) {
	//if char is matching increament of count
				count++;
			}
		}
		if(count==1) {
System.out.print(ch + "  ");		   
}
}
}
}
