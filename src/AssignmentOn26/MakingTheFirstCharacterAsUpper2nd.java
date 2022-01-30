package AssignmentOn26;

public class MakingTheFirstCharacterAsUpper2nd {
public static void main(String[] args) {
	String s = "welcome to india";
	String [] str = s.split(" ");
	for(int i = 0;i<str.length;i++) {
		String s1 = " " +  str[i].charAt(0);
		System.out.print(s1.toUpperCase());
		for(int j = 1;j<str[i].length();j++) {
			System.out.print(str[i].charAt(j));
		}
	}
	System.out.println(" ");
}
}
