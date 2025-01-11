/*

1 - Input :- "Ramana" , "Amaran"   ,     Output :- Anagram
2 - Input :- "Ramana" , "Amakan"   ,     Output :- Not an Anagram
 
*/

package com.String;

//import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) 
	{
		String s1 = "Ramana";
		String s2 = "Amaran";
		
		if(isAnagram(s1, s2))
			System.out.println("Anagram.");
		else
			System.out.println("Not an Anagram.");
	}
	
	static boolean isAnagram(String s1, String s2)
	{
		
	// Approach : 1 :-
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		  
		 
		while(true)
		{
			if(s1.length() != s2.length())
				return false;
			else if(s1.length() == 0 && s2.length() == 0)
				return true;
			
			char ch = s1.charAt(0);
			
			s1 = s1.replace(ch+"", "");
			s2 = s2.replace(ch+"", "");
		}
		
		
/*
	// Approach : 2 :-
		
		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray(); 
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(ch1);
		System.out.println(ch2);
		if(Arrays.equals(ch1, ch2))
			return true;
		
		return false;
		
		*/
	
	}

}
