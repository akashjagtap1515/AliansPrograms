package pack1;

public class ReverseString {

	public static void main(String args[]) {

		String a = "akash is best";

		String b = "";
		int c = a.length() - 1;

		for (int i = c; i >= 0; i--) {
			b = b + a.charAt(i);
		}

		System.out.println(b);

	}

}
