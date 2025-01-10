package com.String;

public class PrintMissingVowelCharacter {

	public static void main(String[] args) {
		
		String s1 = "India";
		String s2 = "aeiouAEIOU";
		String res = "";
		
		for(int i=0;i<s2.length();i++)
		{
			char ch = s2.charAt(i);
			
			if(!(s1.contains(ch+"")))
				res += ch;
		}
		
		System.out.println("Vowels not present in " + "\"" + s1 + "\"" + " is : " + res);
	}

}
