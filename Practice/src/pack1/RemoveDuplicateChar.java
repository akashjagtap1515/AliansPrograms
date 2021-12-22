package pack1;

public class RemoveDuplicateChar {
	public static void main (String [] args) {
	
		String s = "Akash";
		String sp = s.toUpperCase();
		String result= "";
		
		for(int i =0; i<sp.length(); i++)
		{
			char ch= sp.charAt(i);
			
			if(result.indexOf(ch)==-1)
			{
				result =result+ch;
			}
		}
		System.out.println(result);
	}

}
