package com.sowmya.codetest;

public class StringReverse {

	public static void main(String[] args) {
		
		String  s = "CODING TEST";
		StringBuilder reversedString = new StringBuilder();
	    char[] charArray = s.toCharArray();
	    
	    for(int i=charArray.length-1; i>=0; i--)
	    {
	    	reversedString.append(s.charAt(i));
	    }
		
       System.out.println("Reversed String is "+reversedString);
	}

}
