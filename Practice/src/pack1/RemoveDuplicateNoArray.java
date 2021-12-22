package pack1;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicateNoArray {
	public static void main(String [] args)
	{
		int a[]= {1,3,5,99,73,2,5,23,8};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i =0; i<a.length; i++) {
			
			hs.add(a[i]);
		}
		
//		Iterator i = hs.iterator(); 
//		while(i.hasNext())
//		{
//			System.out.println(i.next()+ " ");
//		}
		
		hs.forEach(ele->System.out.print(ele+" "));
	}

}
