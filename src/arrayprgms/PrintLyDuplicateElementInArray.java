package arrayprgms;

import java.util.LinkedHashSet;

public class PrintLyDuplicateElementInArray {
	public static void main(String[] args) {
		int a[] = {1,1,2,3,4,5,5};
		//create any set collection and all the character of given string into set
		LinkedHashSet<Integer> set = 	new LinkedHashSet<Integer>();
		for(int i = 0;i<a.length;i++) {
	         set.add(a[i]);
		}
		System.out.println(set);		
		for(Integer ch : set) {
			 int count=0;
			 for(int i = 0;i<a.length;i++) {
				 if(ch == a[i]) {
					 count++;
				 }
			 }
			 if(count>1) {
				 System.out.println(ch + " " + count + " times");
			 }
		}
	    
}

}
