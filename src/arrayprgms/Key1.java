package arrayprgms;

public class Key1 {
public static void main(String[] args) {
	int a [] = {1,2,3,4,5};
	int key = 1;
	for(int i = 0;i<key;i++) {
		int temp = a[0];
		for(int j = 1;j<a.length;j++) {
			a[j-1]=a[ j ];
			
		}
		a[a.length-1]=temp;
		
	}
	for(int k = 0;k<a.length;k++) {
		System.out.print(a[k]+" " );
		 
	}
	
}
}
