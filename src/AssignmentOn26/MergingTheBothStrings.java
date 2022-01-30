package AssignmentOn26;

public class MergingTheBothStrings {
public static void main(String[] args) {
	String s = "abc"+"xyz" ;
	System.out.println(s);
	for(int i = 0;i<s.length()/2;i++) {
		String s1 = "" +s.charAt(i)+s.charAt(s.length()/2+ i);
		System.out.print(s1);
	}
}
}
