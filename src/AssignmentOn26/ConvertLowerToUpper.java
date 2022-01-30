package AssignmentOn26;

public class ConvertLowerToUpper {
public static void main(String[] args) {
	String s = "stone is";
	for(int i=0;i<s.length();i++) {
		if(i==0) {
		String s1 = "" + s.charAt(i);
		System.out.print(s1.toUpperCase());
	} else {
		System.out.print(s.charAt(i));
	}	
}
}
}
