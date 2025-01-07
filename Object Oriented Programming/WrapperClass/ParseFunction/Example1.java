package com.Oops.WrapperClass.ParseFunction;

public class Example1 {

	public static void main(String[] args) {
		
		String s1 = "true";
		String s2 = "25";
		String s3 = "9.5";
		
		boolean a = Boolean.parseBoolean(s1);
		int b = Integer.parseInt(s2);
		double c = Double.parseDouble(s3);
		
		System.out.println("Non-Primitive Values are :- " + s1 + "\t" + s2 + "\t" + s3);
		System.out.println("Primitive Values are :- " + a + "\t" + b + "\t" + c);

	}

}
