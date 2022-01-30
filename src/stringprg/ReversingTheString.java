package stringprg;

public class ReversingTheString {
	/**
	 * reversing the string without using third variable
	 * @param args
	 */
    public static void main(String[] args) {
		String s = "java";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
	}
 
}
