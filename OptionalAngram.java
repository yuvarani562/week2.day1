package wee2day1;

import java.util.Arrays;

public class OptionalAngram {
	public static void main(String[] arg) {
		
	/*
	 * Pseudo Code
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */

String text1 = "stops";

String text2 = "potss";

 int length = text1.length();
 
 int length2 = text2.length();
 if (length==length2) {
 
 
 char[] arr1 = text1.toCharArray();
  
 char[] arr2 = text2.toCharArray();
 
 Arrays.sort(arr1);
 Arrays.sort(arr2);
 
 
 if (Arrays.equals(arr1, arr2)){
	 System.out.println("Anagram");
	 
 }else {
	 System.out.println("Not Anagram");
	 
	 
 }
 
 
 }else {
	 System.out.println("Not Anagram");
	 
	 
 }

 
 
 

}


}
