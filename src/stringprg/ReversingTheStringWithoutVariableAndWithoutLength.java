package stringprg;
/**
 * ReversingTheStringWithoutVariableAndSWithoutLength
 * @author 91770
 *
 */
public class ReversingTheStringWithoutVariableAndWithoutLength {
public static void main(String[] args) {
	String s = "java";
	char []  ch = s.toCharArray();
	int count  = 0;
	for(char c : ch ) {
		count++;
		
	}
	System.out.println(count);
	for(int i = count-1;i>=0;i--) {
		System.out.print(s.charAt(i));
	}
}
}
