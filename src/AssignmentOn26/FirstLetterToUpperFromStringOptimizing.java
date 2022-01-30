package AssignmentOn26;

public class FirstLetterToUpperFromStringOptimizing {
public static void main(String[] args) {
	String s = "welcome to india";
	String [] str = s.split(" ");
	for(int i = 0;i<str.length;i++) {
		String s1 = "" + str[i].charAt(0);
		System.out.println(s1.toUpperCase()+str[i].substring(i) +" ");
	}
}
}




