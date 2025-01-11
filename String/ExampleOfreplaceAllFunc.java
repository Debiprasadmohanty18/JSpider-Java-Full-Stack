package com.String;

public class ExampleOfreplaceAllFunc {

	public static void main(String[] args) 
	{
		String s1 = "a1b2c3ATr";
		System.out.println(s1);  // a1b2c3ATr
		s1 = s1.replaceAll("[a-zA-Z]","");
		System.out.println(s1);  // 123
	}

}
