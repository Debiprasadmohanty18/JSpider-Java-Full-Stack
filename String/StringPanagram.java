package com.String;

public class StringPanagram {

	public static void main(String[] args) 
	{
		String s1 = "A Quick Brown Fox Jumps Over The Lazy Dog";
		System.out.println(isPanagram(s1));
	}
	
	static boolean isPanagram(String s1)
	{
		if(s1.length()<26)
			return false;
		s1 = s1.toLowerCase();
/*
      // Approach - 1 :-
       
		String s2 = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i=0;i<s2.length();i++)
		{
			char ch = s2.charAt(i);
			if(!s1.contains(ch+""))
				return false;
		}
		
*/
				
		for(char ch='a';ch>='a' && ch<='z';ch++)
		{
			if(!(s1.contains(ch+"")))
				return false;	
		}
		
		return true;
	}

}
