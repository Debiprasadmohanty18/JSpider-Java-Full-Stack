package com.String;

public class StringLengthWithoutLengthFunc {

	public static void main(String[] args) 
	{
		String s1 = "Debiprasad";
		char[] ch = s1.toCharArray();
		int count = 0;
		
		for(char c : ch)
			count++;
		
		System.out.println(count);
	}

}
