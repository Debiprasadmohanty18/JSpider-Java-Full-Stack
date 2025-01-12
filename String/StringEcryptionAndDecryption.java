package com.String;

/*
=> Encode :-
============

1 - Input :- "abc"    ,    Output :- "cde"


=> Decode :- 
=============

1 - Input :- "abc"    ,    Output :- "yza" 
 
*/

public class StringEcryptionAndDecryption {

	public static void main(String[] args) 
	{
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(encryption(s1, 2));
		System.out.println(decryption(s2, 2));
	}
	
	static String encryption(String s1, int n)
	{
		String res = "";
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(Character.isUpperCase(ch))
				res += (char) (((ch+n-'A') % 26 + 26) % 26 + 'A');
			else if(Character.isLowerCase(ch))
				res += (char) (((ch+n-'a') % 26 + 26) % 26 + 'a');
		}
		
		return res;
	}
	
	static String decryption(String s2, int n)
	{
		return encryption(s2, -n);
	}
}
