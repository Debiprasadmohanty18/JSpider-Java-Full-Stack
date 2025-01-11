package com.String;

public class ExampleOfreplaceFunc {

	public static void main(String[] args) 
	{
		String s1 = "java";
		String s2 = "java";
		
		s1.replace("a" , "");
		System.out.println(s1); //java
		
		s1 = s1.replace("a", "");
		System.out.println(s1); // jv
		
		s2 = s2.replace("a", "@");
		System.out.println(s2); // j@v@
	}

}
