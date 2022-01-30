package AssignmentOn26;

public class MakingTheFirstCharacterAsUpper {
public static void main(String[] args) {
	String s = "welcome to tyss";
	String [] str = s.split(" ");
	for(String ss : str )
	{	
	for(int i=0;i<ss.length();i++) {
		if(i==0) {
			String temp = " "+ ss.charAt(i);
			System.out.print(temp.toUpperCase());
		
		} else {
			System.out.print(ss.charAt(i));
		}
		
	}
	System.out.print(" ");
	}
}
}

