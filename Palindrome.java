package week2day2;

public class Palindrome {
	public static void main(String[] arg) {
		String a = "sir";
		String b = "";
		char [] arr = a.toCharArray();
		for (int i = a.length()-1; i >=0; i--) {

			System.out.println(arr [i]);

			b = b+ arr [i];
		}
		System.out.println("b value is: "+b);
		if (a.equals(b)) {
			System.out.println(a +" is palindrome");
			
		} else {
			System.out.println(a +" is not palindrome");
			
		}
		
	}

}
