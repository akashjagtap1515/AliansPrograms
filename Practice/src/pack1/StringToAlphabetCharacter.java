package pack1;

public class StringToAlphabetCharacter {

	public static void main(String args[])
	{
		String s ="Akash";
		
		String a =s.toUpperCase();
		
		char [] c= a.toCharArray();
		 char temp;
		 
		 for(int i=1;i<c.length; i++)
		 {
			 for(int j = 0; j<c.length-i; j++)
			 {
				 if(c[j]>c[j+1])
				 {
					temp = c[j];
					c[j]= c[j+1];
					c[j+1]= temp;
				 }
			 }
		 }
		 System.out.println(c);
	}
}
