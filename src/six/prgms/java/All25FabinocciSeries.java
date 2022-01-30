package six.prgms.java;

public class All25FabinocciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int count =0;
		System.out.println(a + " ");
		System.out.println(b + " ");
		for(int i =0;i<=count;i++) {
			int sum = a + b;
			a=b;
			b=sum;
			count++;
			if(sum>=50) {
				break;
			}
			
			System.out.println(sum);
		}  
	}
}





