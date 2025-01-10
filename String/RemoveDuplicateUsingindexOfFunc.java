package com.String;

public class RemoveDuplicateUsingindexOfFunc {

	public static void main(String[] args) 
	{
		String s1 = "javadev";
		String res = "";
		
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			
			if(res.indexOf(ch) == -1)
				res += ch;
		}
		
		System.out.println("Before string :- " + s1);
		System.out.println("After string :- " + res);
	}

}
