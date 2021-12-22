package pack1;

import java.util.HashMap;

public class DuplicateWordsString {

	public static void main(String[] args) {

		String s ="i am akash and i am tester";
		
		String [] sp = s.split(" ");
		
		HashMap<String , Integer> hm = new HashMap<String,Integer> ();
		for(String w :sp)
		{
			if (hm.get(w)==null)
			{
				hm.put(w, 1);
			}
			else
			{
				hm.put(w, hm.get(w)+1);
			}
		}
		System.out.println(hm);
	}

}
