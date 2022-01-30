package arrayprgms;

public class ElementSegregrateAtEnd {
public static void main(String[] args) {
	int a [] = {1,0,2,0,3,0,0,4};
	int n [] = new int[a.length];
	int m = 0;
	int b = a.length-1;
	for(int i = 0;i<a.length;i++) {
		if(a[i]==0) {
			n[b]=a[i];
			b--;
		} else {
			n[m]=a[i];
			m++;
		}
		
	}
	for(int j = 0;j<a.length;j++) {
	System.out.print(n[j]+ " ");
 }
}
}
 