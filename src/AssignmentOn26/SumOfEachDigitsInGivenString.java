package AssignmentOn26;

public class SumOfEachDigitsInGivenString {
public static void main(String[] args) {
	String s = "a1$b2@c";
	
	int sum = 0;
	for(int i = 0;i<s.length();i++) {
	if(s.charAt(i)>='0' && s.charAt(i)<='9') {
	int num = s.charAt(i)-48;//is use to change the string char into actual numbers by subststracting from char ascii num into int
	sum = sum + num;
	}	
	}
	System.out.println(sum);
}
}
