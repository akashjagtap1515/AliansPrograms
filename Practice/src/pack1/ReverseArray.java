package pack1;

public class ReverseArray {
	public static void main(String [] args) {
		 
		int a [] = {10,2,3,4,5,6,7};
		int b [] = new int [a.length];
		
	   int c =a.length-1;
	   
	   for(int i=c; i>=0; i--)
	   {
		   b[c-i] =a[i];
	   }
	   
	   for (int j =0; j<=c;j++)
	   {
		   a[j] = b[j];
		   System.out.println("Reverse of array is : " + a[j]);
	   }
	}

}
