package com.String;

public class LowestCountPalindromeInAString {

	public static void main(String[] args) 
	{
		String lowString = "MALAYALAM";
		String s1 = "MALAYALAM";
		
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+3;j<s1.length();j++)
			{
				String str = s1.substring(i,j);
				if(isPalindrome(str))
					if(lowString.length() > str.length())
						lowString = str;
			}
		}
		System.out.println(lowString);
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
