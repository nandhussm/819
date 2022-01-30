package AssignmentOn26;

public class FromStringseperateallNumAndSplChar {
public static void main(String[] args) {
	String s = "a1$b2@c";
	String al = "";
	String num = "";
	String splchar = "";
	for(int i = 0;i<s.length();i++) {
		if(s.charAt(i)>='a' && s.charAt(i)<='z' ||  s.charAt(i)>='A' && s.charAt(i)<='Z') {
			al = al + s.charAt(i);
		} else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
			num = num + s.charAt(i);
		} else {
			splchar = splchar + s.charAt(i);
		}
	}
	System.out.println(al);
	System.out.println(num);
	System.out.println(splchar);
	
}
}
