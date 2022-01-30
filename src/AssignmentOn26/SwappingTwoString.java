package AssignmentOn26;

public class SwappingTwoString {
public static void main(String[] args) {
	String s1 = "java";
	String s2 = "selenium";
	s1=s1+s2;
	s2 =s1.substring(0, s1.length()-s2.length());// s1.length()-s2.length() = means s1 = 12 ,s2=8 = 4 so it will take as java 
	s1 = s1.substring(s2.length()); //here it will take from s1 as starts from selenium ly
	System.out.println("s1" + s1);
	System.out.println("s2" + s2);
	
}

}
