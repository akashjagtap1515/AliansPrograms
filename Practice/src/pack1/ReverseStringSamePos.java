package pack1;

public class ReverseStringSamePos {
	
	public static void main(String args[])
	{
		String s = "Akash is best";
		
		String [] sp = s.split(" ");
	
		
		for(int i =0;i<sp.length; i++)
		{
			String a =sp[i];
			
			String b = "";
			for(int j= a.length()-1; j>=0;j--)
			{
				b= b+a.charAt(j);
			}
			
			System.out.print(b+ " ");
		}
		
		
	}

}
