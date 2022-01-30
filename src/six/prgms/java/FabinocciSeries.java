package six.prgms.java;
/**
 * FabinocciSeries
 * @author 91770
 *
 */
public class FabinocciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.println(a + " ");
		System.out.println(b + " ");
	  for(int i =0;i<=2;i++) {
		//or for(int i=1;i<3;i++) 
		  int c = a + b;
		  System.out.println(c + " ");
		  a=b;
		  b=c;
		
	}
	}
}
