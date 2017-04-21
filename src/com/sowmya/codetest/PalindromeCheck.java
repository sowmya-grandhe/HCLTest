package com.sowmya.codetest;

public class PalindromeCheck {

	public static void main(String[] args) {

		String s = "madam";
		String t = "test";
		
		if(isPalindrome(s)){
			System.out.println("Given string "+ s + " is a palindrome." );
		}
		else{
			System.out.println("Given string "+ s + " is not a palindrome." );
		}
		
		if(isPalindrome(t)){
			System.out.println("Given string "+ t + " is a palindrome." );
		}
		else{
			System.out.println("Given string "+ t + " is not a palindrome." );
		}
	}
	
	public static boolean isPalindrome(String inputStr) {
		  int n = inputStr.length()-1;
		  int length = inputStr.length(); 
		  for (int i = 0; i < (length/2); i++) {
		     if (inputStr.charAt(i) != inputStr.charAt(n)) {
		         return false;
		     }
		     n--;
		  }

		  return true;
		}


}
