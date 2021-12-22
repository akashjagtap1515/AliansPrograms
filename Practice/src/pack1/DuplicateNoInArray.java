package pack1;

import java.util.Arrays;

public class DuplicateNoInArray {
	public static void main(String []args) {
		int a[]= {1,2,3,5,4,6,8,3,2,52,8,5};
		Arrays.sort(a);
		
		for(int i=0; i<a.length-1;i++) {
			if(a[i]==a[i+1])
			{			
				System.out.println(a[i]);
			}
			
		}
	
	}

}
