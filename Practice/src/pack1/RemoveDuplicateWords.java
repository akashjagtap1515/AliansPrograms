package pack1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args ) {
		
		String s="i am akash and i am tester";
		
		String [] sp = s.split(" ");
		
		HashSet<String> hs= new HashSet<String>();
		 for(String a :sp)
		 {
			 hs.add(a);
		 }
		 
		 Iterator i =  hs.iterator();
		 
		 while(i.hasNext())
		 {
			 System.out.print(i.next()+ " ");
		 }
		
	}
}
