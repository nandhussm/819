package AssignmentOn26;

import java.util.LinkedHashSet;

public class ReverseTheEachWordOfGivenString {
	public static void main(String[] args) {
		String s = "welcome to TYss company";
	    String [] str = s.split(" ");
	    String rev ="";
	    for(int i=str.length-1;i>=0;i--) {
	         rev= rev+str[i] + " ";
	    }
	    System.out.println(rev);
	}	
}
 