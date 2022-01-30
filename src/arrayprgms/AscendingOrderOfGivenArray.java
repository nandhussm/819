package arrayprgms;

public class AscendingOrderOfGivenArray {
public static void main(String[] args) {
	int a []= {2,3,1,5,4,7,6};
	for(int i = 0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int temp =a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.print(a[i] + " ");
	}	
	
	}
}

