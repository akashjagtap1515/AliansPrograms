package pack1;

import java.util.HashMap;

public class EachCharacterFreq {
	public static void main(String [] args) {
		String s="Akash";
		String sp = s.toUpperCase();
		HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
		
		for(int i = 0; i<sp.length(); i++)
		{
		char ch = sp.charAt(i);
		
		if(hm.containsKey(ch))
		{
			hm.put(ch,hm.get(ch)+1);
		}
		else
		{
			hm.put(ch, 1);
		}
		
		
		}
		System.out.println(hm);
	}
}
