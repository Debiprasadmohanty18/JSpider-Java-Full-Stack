package com.String;

/*

1 - Input :- "MALAYAYAM"    ,   output :- PalindromeString
2 - Input :- "MADAM"    ,   output :- PalindromeString
3 - Input :- "SIR"    ,   output :- NotPalindromeString
 
*/

public class StringPalindrome {

	public static void main(String[] args) {
		
		String s = "MALAYAYAM";
		boolean check = true;
		int st = 0;
		int end = s.length()-1;
		
		while(st<end)
		{
			if(s.charAt(st) != s.charAt(end))
				check = false;
			st++;
			end--;
		}
		
		if(check)
			System.out.println("\"" + s + "\"" + " is a Palindrome.");
		else
			System.out.println("\"" + s + "\"" + " is not a Palindrome.");

	}

}
