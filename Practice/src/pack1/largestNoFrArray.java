package pack1;

public class largestNoFrArray {
	public static void main(String []args)
	{
		int a[] = {1,2,3,4,7,56,8};
		int b = a[0];
		 
		for(int i = 0; i<a.length; i++ )
		{
			if(a[i]>b)
				b =a[i];
		}
		System.out.println(b);
	}

}
