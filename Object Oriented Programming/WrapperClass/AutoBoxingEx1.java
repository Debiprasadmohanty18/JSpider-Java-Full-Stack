package com.Oops.WrapperClass;

public class AutoBoxingEx1 {

	public static void main(String[] args) {
		
		int a = 10;
		Integer b = a; // AutoBoxing Before JDK-1.5
		System.out.println("Primitive Value : " + a);
		System.out.println("Non-Primitive Value : " + b);
		
		int c = 20;
		Integer d = Integer.valueOf(c); // AutoBoxing Before JDK-1.5
		System.out.println("Primitive Value : " + c);
		System.out.println("Non-Primitive Value : " + d);
		
		int e = new Integer(c); // AutoBoxing
		System.out.println("Non-Primitive Value : " + e);
		
		Integer r = 50; // AutoBoxing
		System.out.println("Non-Primitive Value : " + r);

	}

}
