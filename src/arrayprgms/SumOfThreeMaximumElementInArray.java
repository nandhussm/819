package arrayprgms;

public class SumOfThreeMaximumElementInArray {
	public static void main(String[] args) {
		int a []= {20,30,10,50,40};	
		int sum = 0;
		for(int i = 0;i<a.length;i++) {		
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;		
				}
			}
		}
			for(int k = 0;k<3;k++) {
				sum = sum + a[k];
			}
			System.out.println(sum);			
		}		    		
}





