package com.String;

public class CountOccurrenceOfCharacterUsingreplaceFunc {

	public static void main(String[] args) 
	{
		String s1 = "aaabbccdde";
		
		while(s1.length() != 0)
		{
			char ch = s1.charAt(0);
			
			String s2 = s1.replace(ch+"", "");
			System.out.println(ch + " = " + (s1.length() - s2.length()));
			s1 = s2;
		}
	}

}
