package pack1;

public class StringPattern {

	public static void main(String[] args) {
        String s = "abcd";
        String c="";
        for(int i =s.length()-1; i>=0; i--)
        {
        	c= c+s.charAt(i);
        }
        char[] ch =c.toCharArray();
        for(int j= 0; j<ch.length;j++)
        {
        System.out.println( ch [j] );
        }

	}

}
