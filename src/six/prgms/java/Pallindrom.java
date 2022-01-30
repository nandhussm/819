package six.prgms.java;

public class Pallindrom {
	public static void main(String[] args) {
		int num = 121;
		int temp = num;
		int rev=0;
		while(temp!=0) {
			int rem = temp%10;
			rev = (rev*10)+rem;
			temp=temp/10;
			
		}
		if(rev==num) {
			System.out.println(num + "is pallindrom");
		} else {
			System.out.println(num + "is not pallindrom");
		}
	}


}
