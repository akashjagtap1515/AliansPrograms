package pack1;

import java.util.Arrays;

public class SortArray {

	public static void main(String args[])
	{
//		int a[]= {9,8,7,6,5,4,3};
//		Arrays.sort(a);
//		for(int i =0; i<a.length;i++)
//		System.out.println(a[i]);
		
		
		int a[] = {9,8,7,6,5,4,1};
		int temp;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j =0; j<a.length; j++)
			{
				if (a[i]<a[j])
				{
					temp = a[i];
					a[i]= a[j];
					a[j] =temp;
				}
			}
		}
		for(int k = 0; k<a.length; k++)
			System.out.println(a[k]);
		
	}
}
