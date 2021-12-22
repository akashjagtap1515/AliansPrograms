package pack1;

public class NoWordsString {

	public static void main(String [] args)
	{
		String s ="I am Akash And I am Tester";
		int count =1;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
