package com.String;

/*

1 - Input :- "MADAM SIR MADAM ANTHE MALAYALAM"    ,    output :- MADAM MADAM MALAYALAM
 
*/

public class PalindromeWordsInAString {

	public static void main(String[] args) 
	{
		String s1 = "MADAM SIR MADAM ANTHE MALAYALAM";
		String[] str = s1.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			if(isPalindrome(str[i]))
				System.out.print(str[i] + " ");
		}
	}

	 static boolean isPalindrome(String s2) 
	 {		 
		char[] ch = s2.toCharArray();
		int st = 0;
		int end = ch.length-1;
		
		while(st<end)
		{
			if(ch[st] != ch[end])
				return false;
			
			st++;
			end--;
		}
		return true;
	 }

}
