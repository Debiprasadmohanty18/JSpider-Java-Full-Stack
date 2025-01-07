package com.String;

/*

1 - Input :- "JAVA"    ,   output :- "AVAJ"
2 - Input :- "PYTHON"  ,   output :- "NOHTYP"  
 
*/

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "JAVA";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev += s.charAt(i);
		}
		
		System.out.println("Original String :- " + s);
		System.out.println("Reversed String :- " + rev);
	}

}
