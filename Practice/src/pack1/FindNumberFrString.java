package pack1;

public class FindNumberFrString {

	public static void main(String[] args) {
		String sp ="Inte4rn6et 1hos2ting f5or sof9twa3re develo7pment 8and versi1on cont2rol 8using Gi9t.";
		//s= s.replaceAll("\\D+","");
		String [] s=sp.split(" ");
		   int tp =0;
		for(int i=0; i<s.length;i++ )
		{
	          String  n=s[i].replaceAll("\\D+","");
	          
	          int t =Integer.parseInt(n);
	       
	           tp= tp +t; 
	          
		}
		 System.out.println(tp);

	}

}
